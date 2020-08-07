package com.example.demo;


import org.junit.jupiter.api.Test;
import org.redisson.api.RBucket;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest(classes = DemoApplication.class)
@Component
public class RedissonTest {

    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void set() {
        // 设置字符串
        RBucket<String> keyObj = redissonClient.getBucket("k1");
        keyObj.set("v1236");
    }

    @Test
    public void lock() {
        RLock lock = redissonClient.getLock("");
        try {
            lock.lock();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
