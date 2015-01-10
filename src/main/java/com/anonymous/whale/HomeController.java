package com.anonymous.whale;

import com.anonymous.whale.sim.domain.Image;
import com.anonymous.whale.sim.service.IImageService;
import com.anonymous.whale.sim.enums.ImageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinliujie on 15-1-10.
 */
@Controller
public class HomeController {
    @Autowired
    private IImageService imageServiceImpl;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView show() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        List<Image> images = imageServiceImpl.listByType(null);
        if(images == null){
            return mav;
        }
        List<Image> banners = new ArrayList<Image>();
        for (Image image : images) {
            int type = image.getType();
            if (type == ImageType.BANNER.getCode()) {
                banners.add(image);
            } else if (type == ImageType.TODAY.getCode()) {
                mav.addObject("today", image);
            } else if (type == ImageType.TOMORROW.getCode()) {
                mav.addObject("tomorrow", image);
            }
        }
        mav.addObject("banners", banners);
        return mav;
    }

}
