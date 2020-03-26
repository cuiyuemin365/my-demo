package com.damin.spring.applicationevent;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;
import java.util.Objects;

@Slf4j
public class MySimpleAsyncUncaughtExceptionHandler extends SimpleAsyncUncaughtExceptionHandler {

    @Override
    public void handleUncaughtException(Throwable ex, Method method, Object... params) {
        if (Objects.nonNull(params) && params.length == 1 && params[0] instanceof StgEvent) {
            ReRunData reRunData = new ReRunData();
            reRunData.setClassName(method.getDeclaringClass().getName());
            reRunData.setMethodName(method.getName());
            reRunData.setEventClassName(params[0].getClass().getName());
            reRunData.setPayload(JSON.toJSONString(params[0]));
            log.error("AsyncUncaughtException occurred invoking async method: {} ,params : {}", method, JSON.toJSONString(reRunData), ex);
        } else {
            super.handleUncaughtException(ex, method, params);
        }
    }

}
