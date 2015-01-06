package com.anonymous.whale.common.model;

/**
 * Created by qinliujie on 15-1-6.
 */

import com.anonymous.whale.common.enums.ResultStatus;

public class APIResult <T> {
    //状态，必填！0=成功，1...999=其他
    private int status;
    //返回的数据，选填
    private T data;
    //错误时的提示，错误时必填
    private String message;

    private APIResult() {};

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static <T> APIResult getInstance(ResultStatus resultStatus) {
        if(resultStatus == null) {
            return null;
        }
        APIResult apiResult = new APIResult();
        apiResult.setStatus(resultStatus.getCode());
        apiResult.setMessage(resultStatus.getField());
        return apiResult;
    }

    public static <T> APIResult getInstance(ResultStatus resultStatus, String message) {
        if(resultStatus == null) {
            return null;
        }
        APIResult apiResult = new APIResult();
        apiResult.setStatus(resultStatus.getCode());
        apiResult.setMessage(message);
        return apiResult;
    }

    public static <T> APIResult getInstance(T data, ResultStatus resultStatus) {
        if(resultStatus == null) {
            return null;
        }
        APIResult apiResult = new APIResult();
        apiResult.setData(data);
        apiResult.setStatus(resultStatus.getCode());
        apiResult.setMessage(resultStatus.getField());
        return apiResult;
    }
}

