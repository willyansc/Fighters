package com.anonymous.whale.sample.dao.impl;

import com.anonymous.whale.sample.dao.ISampleDao;
import com.anonymous.whale.sample.domain.Sample;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by qinliujie on 15-1-6.
 */
@Repository
public class SampleDaoImpl implements ISampleDao {
    private final static String BASE = "com.anonymous.whale.sample.SampleMapper.";
    private final static String STATEMENT_SELECT_BY_ID = BASE + "selectOneById";
    private final static String STATEMENT_INSERT_NAME = BASE + "insert";
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    public Sample getById(int id) {
        return (Sample)sqlSessionTemplate.selectOne(STATEMENT_SELECT_BY_ID, id);
    }
    @Override
    public int insert(Sample sample){
    	String name = sample.getName();
    	return (Integer)sqlSessionTemplate.insert(STATEMENT_INSERT_NAME, name);
    }
}
