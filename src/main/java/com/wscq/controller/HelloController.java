package com.wscq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zs on 16/10/21.
 */
@Controller
public class HelloController {

    @RequestMapping("login")
    public String login() {
        return "login";
    }
}
