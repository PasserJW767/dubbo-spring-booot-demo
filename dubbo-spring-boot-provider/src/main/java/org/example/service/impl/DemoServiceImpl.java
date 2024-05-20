package org.example.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.DemoService;
import org.example.pojo.User;

@DubboService
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello() {
        return "Dubbo, Hello!";
    }

    @Override
    public User getUserById(int id) {
        User user = new User(id, "xiaoming", "123456");
        return user;
    }
}
