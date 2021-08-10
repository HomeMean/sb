package com.homemean.sb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@Controller
//@ResponseBody
@RestController
public class HelloworldController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot!";
    }

}
