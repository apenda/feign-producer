package com.apenda.core.data;

import lombok.Data;

/**
 * @author rui.zhou
 * @date 2021/10/16 15:41
 **/
@Data
public class Response {

    /**
    * 错误码
    */
    private Integer code;

    /**
    * 消息
    */
    private String message;

    public Response() {
    }

    public Response(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
