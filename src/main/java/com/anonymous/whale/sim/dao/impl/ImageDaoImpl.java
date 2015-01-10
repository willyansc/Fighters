package com.anonymous.whale.sim.dao.impl;

import com.anonymous.whale.sim.domain.Image;
import com.anonymous.whale.sim.dao.IImageDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qinliujie on 15-1-10.
 */
@Repository
public class ImageDaoImpl implements IImageDao {
    private final static String BASE = "com.anonymous.whale.sim.ImageMapper.";
    private final static String STATEMENT_LIST_BY_PARAM = BASE + "listByParam";
    private static final Log dbLog = LogFactory.getLog("db");
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    public boolean insert(Image image) {
        return false;
    }

    @Override
    public boolean update(Image image) {
        return false;
    }

    @Override
    public List<Image> listByParam(Image image) {
        dbLog.info(image);
        return (List<Image>)sqlSessionTemplate.selectList(STATEMENT_LIST_BY_PARAM, image);
    }
}
