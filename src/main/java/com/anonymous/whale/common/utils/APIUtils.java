package com.anonymous.whale.common.utils;

import com.anonymous.whale.common.enums.ResultStatus;
import com.anonymous.whale.common.model.APIResult;

/**
 * Created by qinliujie on 15-1-6.
 */
public class APIUtils <T> {

    /**
     * 构造操作状态的响应信息
     *
     * @param resultStatus 操作结果
     * @return 响应
     */
    public static APIResult getResponse(ResultStatus resultStatus) {
        return APIResult.getInstance(resultStatus);
    }

    /**
     * 构造异常的响应信息
     *
     * @param e 异常
     * @return 响应
     */
    public static APIResult getResponse(Exception e) {
        if (e instanceof NullPointerException) {
            return APIResult.getInstance(ResultStatus.EXCEPTION, e.toString());//因为空指针异常getMessage方法返回空
        }
        return APIResult.getInstance(ResultStatus.EXCEPTION, e.getMessage());
    }

    /**
     * 构造数据的响应信息
     *
     * @param data 数据
     * @return 响应
     */
    public static <T> APIResult getResponse(T data) {
        return APIResult.getInstance(data, ResultStatus.SUCCESS);
    }

}
