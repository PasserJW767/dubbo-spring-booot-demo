package org.example;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    @DubboReference
    DemoService demoService;

    @RequestMapping("/user")
    public User getUser(int id){
        return demoService.getUserById(1);
    }

}
