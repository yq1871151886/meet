package com.fh.enumbean;

public enum ResponseEnum {
    //注释  每人10行
    // 耿 11-20
    // 杨 21-30
    // 崔 31-40
    // 白 41-50
    // 梁 51-60
    // 孔 61-70
    SUCCESS(500,"成功！")
    ,LOGIN_TOKEN_INVALID(501,"token验证失败！")


    ;


    private Integer code;
    private String message;

    private ResponseEnum(Integer code, String message) {
        this.code=code;
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
