package com.anonymous.whale.sim.dao;

import com.anonymous.whale.sim.domain.Image;

import java.util.List;

/**
 * Created by qinliujie on 15-1-10.
 */
public interface IImageDao {
    /**
     * 增加一条记录
     * @param image
     * @@return 0成功 1失败
     */
    public boolean insert(Image image);

    /**
     * 更新记录
     * @param image
     * @return 0成功 1失败
     */
    public boolean update(Image image);

    /**
     * 查找符合条件的记录
     * @param image
     * @return 没有记录返回null
     */
    public List<Image> listByParam(Image image);
}
