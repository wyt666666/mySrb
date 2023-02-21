package com.itcast.wuhan.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    private R(){}
    public R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 返回成功
     */
    public static R ok(){
        return new R(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage());
    }

    /**
     * 返回失败
     */
    public static R error(){
        return new R(ResponseEnum.ERROR.getCode(), ResponseEnum.ERROR.getMessage());
    }

    /**
     * 设置特定结果
     */
    public static R setResult(ResponseEnum responseEnum){
        return new R(responseEnum.getCode(), responseEnum.getMessage());
    }

    public R message(String message){
        this.setMessage(message);
        return this;
    }

    public R code(Integer code){
        this.setCode(code);
        return this;
    }

    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
