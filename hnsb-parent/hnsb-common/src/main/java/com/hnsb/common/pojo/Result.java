package com.hnsb.common.pojo;

import lombok.Data;

/**
 * @description: 返回消息类
 * @author: 喻卫
 * @time: 2020/6/22 22:25
 * @version: 1.0
 **/
@Data
public class Result<T> {
    /**
     * 是否成功
     */
    private boolean flag;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

}