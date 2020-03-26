package com.damin.spring.applicationevent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BlackListEventListener {


    @EventListener
    public void run(StgDataAEvent stgEvent) {
        log.info("run : {}", stgEvent.getStgDataA());
    }

    @Async
    @EventListener
    public void run2(StgDataAEvent stgEvent) {
        log.info("run2 : {}", stgEvent.getStgDataA());
    }

    @EventListener
    public void run3(StgDataAEvent stgEvent) {
        log.info("run3 : {}", stgEvent);
        throw new RuntimeException("1234512");
    }

}
