package com.demo.tx.aop.service;

import com.demo.tx.aop.AopA;
import com.demo.tx.aop.model.User;

public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User createUser2(String firstName, String lastName, int age);

}
