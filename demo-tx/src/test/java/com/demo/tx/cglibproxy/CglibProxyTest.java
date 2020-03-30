package com.demo.tx.cglibproxy;

import com.demo.tx.jdkproxy.TopicService;
import com.demo.tx.jdkproxy.TopicServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class CglibProxyTest {

    @Test
    public void removeTopic() {
        CglibProxy cglibProxy = new CglibProxy();
        TopicService topicService = (TopicService)
                cglibProxy.getProxy(TopicServiceImpl.class);
        topicService.removeTopic(1L);
    }
}
