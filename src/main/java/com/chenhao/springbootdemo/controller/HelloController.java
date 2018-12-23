package com.chenhao.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);


    @GetMapping(value = "/hello")
    public String Hello(){
        logger.info("Hello,Chenhao");
        return "index";
    }
    @GetMapping(value = "/helloworld")
    @ResponseBody
    public String HelloWorld(){
        logger.info("Hello,World");
        return "Hello,world";
    }

    @GetMapping(value = "/kafka")
    @ResponseBody
    public String kafkaTest(String message){
        logger.info("Hello,World");
        return "Hello,world";
    }
}
