package com.demo.tx.jdkproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TopicServiceImpl implements TopicService {


    @Override
    public void removeTopic(Long topicId) {
        log.info("删除topic记录{}", topicId);
    }

    public void removeTopic2(Long topicId) {
        log.info("删除topic记录{}", topicId);
    }

    private String test() {
        return "asdf";
    }

}
