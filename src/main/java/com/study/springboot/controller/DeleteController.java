package com.study.springboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delete-apt")
public class DeleteController {
    @DeleteMapping(value = "/{variable}")
    public String DaleteVariable(@PathVariable String variable){
        return variable;
    }
}
