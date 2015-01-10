package com.anonymous.whale.sim.service.impl;

import com.anonymous.whale.sim.dao.IImageDao;
import com.anonymous.whale.sim.domain.Image;
import com.anonymous.whale.sim.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qinliujie on 15-1-10.
 */
@Service
public class ImageServiceImpl implements IImageService {
    @Autowired
    private IImageDao imageDaoImpl;
    @Override
    public boolean insert(Image image) {
        return false;
    }

    @Override
    public boolean update(Image image) {
        return false;
    }

    @Override
    public List<Image> listByType(Integer type) {
        Image param = new Image();
        param.setType(type);
        return imageDaoImpl.listByParam(param);
    }
}
