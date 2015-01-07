package com.anonymous.whale.sample.controller;

import com.anonymous.whale.common.enums.ResultStatus;
import com.anonymous.whale.common.model.APIResult;
import com.anonymous.whale.common.utils.APIUtils;
import com.anonymous.whale.sample.domain.Sample;
import com.anonymous.whale.sample.service.ISampleService;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by qinliujie on 15-1-6.
 */
@Controller
@RequestMapping("/sample")
public class SapController {
    @Autowired
    private ISampleService sampleServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/{id}.json", method = RequestMethod.GET)
    public APIResult getJson(@PathVariable int id) {
        Sample sample = sampleServiceImpl.getById(id);
        return APIUtils.getResponse(sample);
    }

    @RequestMapping(value = "/{id}.html", method = RequestMethod.GET)
    public ModelAndView getView(@PathVariable int id){
        Sample sample = sampleServiceImpl.getById(id);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sample/item");
        mav.addObject("sample", sample);
        return mav;
    }

}

