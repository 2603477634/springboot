package com.first.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @ResponseBody
    @GetMapping("/hello")
    public String Hello(){
        return "this is a Springboot project";
    }

}
