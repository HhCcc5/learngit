package com.hchcc.miaoshaDemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {
    @RequestMapping("/demo")
    public String demo(){
        return "Hello World";
    }
}
