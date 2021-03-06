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
    ,LOGINNAME_AND_PWD_IS_NULL(501,"账号或密码为空")
    ,LOGINNAME_IS_NOT_EXIST(501,"账号不存在")
    ,LOGIN_PWD_IS_NOT_TRUE(501,"账号不存在")
    ,PREMETER_IS_NOT_NULL(502,"参数不能为空")








    //杨奇宫
    ,ERROR(2001,"提交例会成功")
    ,PERMISSIONS_ADD_SUCCESS(200,"权限增加成功")
    ,PERMISSIONS_UPDATE_SUCCESS(200,"权限增加成功")






    ,COMMIT_SUCCESS(2001,"提交例会成功")







































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
