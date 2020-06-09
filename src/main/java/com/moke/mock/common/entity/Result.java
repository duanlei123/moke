package com.moke.mock.common.entity;

/**
 * @author wb-dl321273
 * @date 2020/6/8 16:43
 * @description 接口负责研发：
 * 接口文档：
 * 接口说明(业务介绍，介绍重要参数的用途)：
 */
public class Result {

    private static final long serialVersionUID = 7072958101218743076L;
    private int code = 1;
    private String message="success";
    private Object data;

    public int getCode() {
        return code;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    private Result(Object data){
        this.data=data;
    }
    public static Result view(Object object){
        return new Result(object);
    }
}
