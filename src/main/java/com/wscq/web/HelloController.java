package com.wscq.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zs on 16/10/21.
 */
@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("login")
    public String login() {
        logger.info("this is test!");
//        logger.error("this is error");
//        System.out.println("madan");
        return "login";
    }
}
