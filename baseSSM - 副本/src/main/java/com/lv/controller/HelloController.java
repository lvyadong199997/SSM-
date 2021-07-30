package com.lv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/world")
    public String sayHello() {
        return "hello world";
    }
}
