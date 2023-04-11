package com.study.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/get-api")
public class HelloController {

    @RequestMapping( "/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping(value = "/gethello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName(){
        return "HamTory";
    }

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

}
