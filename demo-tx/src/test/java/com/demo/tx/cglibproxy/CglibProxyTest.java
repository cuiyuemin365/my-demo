package com.demo.tx.cglibproxy;

import com.demo.tx.jdkproxy.TopicService;
import com.demo.tx.jdkproxy.TopicServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.cglib.core.DebuggingClassWriter;

@Slf4j
public class CglibProxyTest {

    @Test
    public void removeTopic() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/data/project/damin-demo/demo-tx/src/test/java/com/demo/tx/cglibproxy");
        CglibProxy cglibProxy = new CglibProxy();
        TopicService topicService = (TopicService)
                cglibProxy.getProxy(TopicServiceImpl.class);
        topicService.removeTopic(1L);
    }
}
