package com.anonymous.whale.sim.enums;


/**
 * Created by qinliujie on 15-1-10.
 */
public enum ImageType {
    BANNER(1, "首页banner"),
    TODAY(2, "今日推荐"),
    TOMORROW(3, "明日预告"),
    ELSE(99, "其他");
    //随时扩充
    private int code;
    private String type;

    ImageType(int code, String type) {
        this.code = code;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
