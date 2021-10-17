package com.apenda.core.handler;

import com.alibaba.fastjson.JSON;
import com.apenda.core.data.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

/**
 * @author rui.zhou
 * @date 2021/10/16 15:37
 **/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Object otherExceptionHandler(Exception e) {
        Response response = new Response(99, "未知系统异常");
        log.error( "An error occurred while processing your request : Cause by "+ e,e);
        log.info("Response Args  : {}", JSON.toJSONString(response));
        return response;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.OK)
    public Object methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        return this.printError(77, e);
    }

    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.OK)
    public Object bindExceptionHandler(BindException e) {
        return this.printError(88, e);
    }

    private Response printError(int code, BindException e) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (servletRequestAttributes != null) {
            HttpServletRequest request = servletRequestAttributes.getRequest();
            log.info("Request URL    : {}", request.getRequestURL());
        }
        Response response = new Response(code, this.getMessage(e));
        log.info("Response Args  : {}", JSON.toJSONString(response));
        return response;
    }

    private String getMessage(BindException e) {
        log.debug("Exception occurred while processing your request : Cause by " + e, e);
        BindingResult result = e.getBindingResult();
        FieldError error = result.getFieldError();
        if (error == null) {
            return null;
        }
        String field = error.getField();
        String code = error.getDefaultMessage();
        return String.format("%s:%s", field, code);
    }

}
