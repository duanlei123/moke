package com.moke.mock.common.entity;

import java.util.Map;
import com.google.common.collect.Maps;

/**
 * @author wb-dl321273
 * @date 2020/6/8 16:44
 * @description 接口负责研发：
 * 接口文档：
 * 接口说明(业务介绍，介绍重要参数的用途)：
 */
public class ResponseBuilder {

    public final static String RESPONSE_PROPERTY_RESULT = "result";
    public final static String RESPONSE_PROPERTY_VERSION = "version";
    public final static String RESPONSE_PROPERTY_TIMESTAMP = "timestamp";
    public final static String RESPONSE_PROPERTY_MESSAGE = "message";
    public final static String RESPONSE_PROPERTY_CODE = "code";
    public final static String RESPONSE_PROPERTY_DATA = "data";
    public final static int RESPONSE_PROPERTY_CODE_SUCCESS = 1;
    public final static int RESPONSE_PROPERTY_CODE_FAILURE = 2;
    public final static int RESPONSE_PROPERTY_CODE_UNEXPECTED = 0;



    /**
     * 构建通用的成功消息(统一默认返回值，version=1.0 message=success)
     * @return
     */
    public static Map<String,Object> buildSuccessResponse(){
        Map<String,Object> response = Maps.newHashMap();
        response.put(RESPONSE_PROPERTY_CODE,RESPONSE_PROPERTY_CODE_SUCCESS);
        response.put(RESPONSE_PROPERTY_RESULT,true);
        response.put(RESPONSE_PROPERTY_VERSION , "1.0");
        response.put(RESPONSE_PROPERTY_TIMESTAMP,System.currentTimeMillis());
        response.put(RESPONSE_PROPERTY_MESSAGE,"Successful.");
        return response;
    }

    /**
     * 构建通用的成功消息(统一默认返回值，version=1.0 message=success)
     * @return
     */
    public static Map<String,Object> buildSuccessResponse(Object data){
        Map<String,Object> response = Maps.newHashMap();
        response.put(RESPONSE_PROPERTY_CODE,RESPONSE_PROPERTY_CODE_SUCCESS);
        response.put(RESPONSE_PROPERTY_RESULT,true);
        response.put(RESPONSE_PROPERTY_DATA , data);
        response.put(RESPONSE_PROPERTY_VERSION , "1.0");
        response.put(RESPONSE_PROPERTY_TIMESTAMP,System.currentTimeMillis());
        response.put(RESPONSE_PROPERTY_MESSAGE,"Successful.");
        return response;
    }

    /**
     * 构建通用的失败消息（默认的code和message）<b/>
     * 失败原因message值为"Failure",不建议使用该方法，除非真的给不出好的失败原因
     * @return
     */
    @Deprecated
    public static Map<String,Object> buildFailureResponse(){
        return buildFailureResponse(RESPONSE_PROPERTY_CODE_FAILURE,"Failure");
    }

    /**
     * 构建自定义消息的失败消息
     * @param message 错误消息
     * @return
     */
    public static Map<String,Object> buildFailureResponse(String message){
        return buildFailureResponse(RESPONSE_PROPERTY_CODE_FAILURE,message);
    }

    /**
     * 构建自定义code和message的失败消息
     * @param code
     * @param message
     * @return
     */
    public static Map<String,Object> buildFailureResponse(int code,String message){
        Map<String,Object> response = Maps.newHashMap();
        response.put(RESPONSE_PROPERTY_CODE,code);
        response.put(RESPONSE_PROPERTY_RESULT,false);
        response.put(RESPONSE_PROPERTY_VERSION , "1.0");
        response.put(RESPONSE_PROPERTY_TIMESTAMP,System.currentTimeMillis());
        response.put(RESPONSE_PROPERTY_MESSAGE,message);
        return response;
    }

    /**
     * 构建自定义code和message的失败消息
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static Map<String,Object> buildFailureResponse(int code,String message,Object data){
        Map<String,Object> response = Maps.newHashMap();
        response.put(RESPONSE_PROPERTY_CODE,code);
        response.put(RESPONSE_PROPERTY_RESULT,false);
        response.put(RESPONSE_PROPERTY_VERSION , "1.0");
        response.put(RESPONSE_PROPERTY_DATA , data);
        response.put(RESPONSE_PROPERTY_TIMESTAMP,System.currentTimeMillis());
        response.put(RESPONSE_PROPERTY_MESSAGE,message);
        return response;
    }
}
