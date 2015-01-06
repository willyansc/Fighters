package com.anonymous.whale.common.enums;

/**
 * Created by qinliujie on 15-1-6.
 */
public enum ResultStatus {
    /**
     * 系统相关*
     */
    SUCCESS(0, "执行成功"),
    PARAMETER_NULL(1, "参数为空"),
    EXCEPTION(2, "执行异常"),
    DB_ERROR(3, "数据库错误"),
    OUTER_API_CALL_FAIL(5, "外部接口调用失败"),
    USER_NO_AUTHORITY(998, "用户无权限"),
    USER_NO_LOGIN(999, "用户未登录"),

    /**
     * 业务相关*
     */
    NOTHING_CHANGE(200, "无任何修改");

    private Integer code;
    private String field;

    private ResultStatus(Integer code, String field) {
        this.code = code;
        this.field = field;
    }

    public int getCode() {
        return code;
    }

    public String getField() {
        return field;
    }
}
