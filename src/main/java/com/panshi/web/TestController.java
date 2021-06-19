package com.panshi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/jsp")
public class TestController {

    @RequestMapping("/test")
    public  String test(){
        System.out.println("进来了");
        return "test.jsp";
    }
}
