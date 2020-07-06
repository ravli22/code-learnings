package com.learning.springbootconfig.controller;

import com.learning.springbootconfig.util.DBSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/greet")
public class GreetingController {

    @Value( "${my.greeting}" )
    private String greeting;

    @Value( "${my.appGreeting}" )
    private String appGreeting;

    @Value( "this is the static message" )
    private String staticMessage;

    @Value( "${val.default : this is the default value of the prop}" )
    private String valueWithDefaultValue;

    @Value( "${values}" )
    private List<String> values;

    @Value( "#{${dbvalues}}" )
    private Map<String ,String > dbvalues;

    @Autowired
    private DBSettings dbSettings;

    @GetMapping
    public String greeting(){
        return greeting + staticMessage + valueWithDefaultValue + values + dbvalues;
    }

    @GetMapping(value = "/app")
    public String appGreeting(){
        return appGreeting;
    }

    @GetMapping(value = "/db")
    public String getDBConnection(){
       return  dbSettings.getConnection();
    }
}
