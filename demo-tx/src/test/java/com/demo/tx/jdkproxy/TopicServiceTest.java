package com.demo.tx.jdkproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class TopicServiceTest {


    @Test
    public void removeTopic() {
        TopicService target = new TopicServiceImpl();
        PerformanceHandler performanceHandler = new PerformanceHandler(target);
        TopicService proxy = (TopicService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), performanceHandler);
        proxy.removeTopic(1L);
    }
}
