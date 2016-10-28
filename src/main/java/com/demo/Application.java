package com.demo;

import com.demo.domain.model.mybatis.gen.TUser;
import com.demo.domain.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zs on 16/10/20.
 */
@SpringBootApplication
@RestController
public class Application {

    @Autowired
    UserService userService;

    /**
     * 测试
     *
     * @return
     */
    @RequestMapping("/")
    public String home(){
        List<TUser> tUsers = userService.findAll();
        return "hello world! " + (tUsers.isEmpty() ? "" : tUsers.get(0).getName());
    }

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}