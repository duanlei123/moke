package com.moke.mock.common.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wb-dl321273
 * @date 2020/6/8 16:41
 * @description 接口负责研发：
 * 接口文档：
 * 接口说明(业务介绍，介绍重要参数的用途)：
 */
public class LogFactory {

    public static Logger getLogger(LoggerEnum loggerEnum){
        return LoggerFactory.getLogger(loggerEnum.getName());
    }
}
