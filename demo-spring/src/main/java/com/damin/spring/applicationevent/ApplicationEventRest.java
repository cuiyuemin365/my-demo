package com.damin.spring.applicationevent;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@Slf4j
public class ApplicationEventRest implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostMapping("/rePublishEvent")
    public void rePublishEvent(@RequestBody StgEvent stgEvent) {
        applicationContext.publishEvent(stgEvent);
    }

    @PostMapping("/reRun")
    public void reRun(@RequestBody ReRunData reRunData) {
        try {
            Object target =
                    applicationContext.getBean(Class.forName(reRunData.getClassName()));
            Method method =
                    ReflectionUtils.findMethod(Class.forName(reRunData.getClassName()), reRunData.getMethodName(), Class.forName(reRunData.getEventClassName()));
            ReflectionUtils.invokeMethod(method, target, JSON.parseObject(reRunData.getPayload(), Class.forName(reRunData.getEventClassName())));
        } catch (Exception e) {
            log.error("reRun:", e);
        }
    }

    @GetMapping("/publishEvent")
    public void publishEvent() {
        StgDataA stgDataA = new StgDataA();
        stgDataA.setId(3);
        stgDataA.setName("stg");
        StgDataAEvent stgDataAEvent = new StgDataAEvent(stgDataA);
        applicationContext.publishEvent(stgDataAEvent);
    }

}
