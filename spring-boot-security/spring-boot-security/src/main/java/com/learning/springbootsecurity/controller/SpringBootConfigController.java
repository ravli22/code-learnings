package com.learning.springbootsecurity.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootConfigController {
    @RequestMapping(value = "/home")
    public String home(){
        return "Welcome";
    }

    @RequestMapping(value = "/user")
    public String user(){
        return "Welcome user";
    }

    @RequestMapping(value = "/admin")
    public String admin(){
        return "Welcome admin";
    }
}
