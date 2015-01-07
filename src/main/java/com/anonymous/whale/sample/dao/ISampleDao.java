package com.anonymous.whale.sample.dao;

import com.anonymous.whale.sample.domain.Sample;

/**
 * Created by qinliujie on 15-1-6.
 */
public interface ISampleDao {
    /**
     * 得到值
     * @param id
     * @return
     */
    public Sample getById(int id);
}
