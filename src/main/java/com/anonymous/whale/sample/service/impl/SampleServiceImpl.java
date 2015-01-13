package com.anonymous.whale.sample.service.impl;

import com.anonymous.whale.sample.dao.ISampleDao;
import com.anonymous.whale.sample.domain.Sample;
import com.anonymous.whale.sample.service.ISampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qinliujie on 15-1-6.
 */
@Service
public class SampleServiceImpl implements ISampleService{
    @Autowired
    private ISampleDao sampleDaoImpl;
    @Override
    public Sample getById(int id) {
        return sampleDaoImpl.getById(id);
    }
    @Override
    public int insert(String name){
    	Sample sample = new Sample();
    	sample.setName(name);
    	return sampleDaoImpl.insert(sample);
    }
    
   @Override
   public int delete(int id){
	   return sampleDaoImpl.delete(id);
   }
}
