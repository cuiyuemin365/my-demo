package com.demo.tx.aop;

import com.demo.tx.DemoApplication;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserServiceTest {


    @Autowired
    private UserService userService;

    @org.junit.Test
    public void createUser() {
        userService.createUser("a", "b", 11);
    }
}
