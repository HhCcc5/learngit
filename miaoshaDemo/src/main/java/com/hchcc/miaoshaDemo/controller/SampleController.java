package com.hchcc.miaoshaDemo.controller;


import com.hchcc.miaoshaDemo.Result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("/hello")
    @ResponseBody
    public String demo(){
        return "Hello World";
    }

    @RequestMapping("/result")
    @ResponseBody
    public Result<String> result(){
        return new Result<String>(0,"success","Hello world");
    }


    @RequestMapping("/thymeleaf")
    public String htmlDemo(Model model){
        model.addAttribute("name","zfm");
        return "hello";
    }

    //1. rest ful json
    //2. 页面
}
