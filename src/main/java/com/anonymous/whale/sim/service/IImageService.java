package com.anonymous.whale.sim.service;

import com.anonymous.whale.sim.domain.Image;

import java.util.List;

/**
 * Created by qinliujie on 15-1-10.
 */
public interface IImageService {
    /**
     * 插入图片
     * @param image 必须指定图片类型
     * @see com.anonymous.whale.sim.enums.ImageType
     * @return 0成功 1失败
     */
    public boolean insert(Image image);

    /**
     * 以id为key更新图片
     * @param image
     * @return 0成功 1失败
     */
    public boolean update(Image image);

    /**
     * 列出符合条件的图片
     * @param type 图片类型 为空查询所有图片
     * @return 没有返回null
     */
    public List<Image> listByType(Integer type);
}
