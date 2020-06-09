package com.moke.mock.common.log;

/**
 * @author wb-dl321273
 * @date 2020/6/8 16:39
 * @description 接口负责研发：
 * 接口文档：
 * 接口说明(业务介绍，介绍重要参数的用途)：
 */
public enum  LoggerEnum {

    ERROR_LOGGER("errorLogger"),
    BASE_LOGGER("baseLogger"),
    ACCESS_LOGGER("accessLogger");

    private String name;

    LoggerEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
