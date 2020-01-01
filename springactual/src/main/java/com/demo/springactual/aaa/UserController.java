package com.demo.springactual.aaa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-11-10 13:24
 */
@RestController("/a")
public class UserController {

    @RequestMapping(value = "/aaa", method = RequestMethod.GET)
    public User get() {
        User user = new User();
        user.setName("foo");
        return user;
    }
}
