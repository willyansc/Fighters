package com.anonymous.whale.sample.service;

import com.anonymous.whale.sample.domain.Sample;

/**
 * Created by qinliujie on 15-1-6.
 */
public interface ISampleService {
    /**
     * 根据id获取值
     * @param id
     * @return
     */
    public Sample getById(int id);
    
    public int insert(String name);
}
