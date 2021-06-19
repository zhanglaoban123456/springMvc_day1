package com.panshi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.filter.CharacterEncodingFilter;

@Controller
@RequestMapping("/jsp")
public class TestController {
    /*
    *  /student/test
    *  /student/
    *  /test.jsp
    *
    * */

    @RequestMapping("/test")
    public  String test(){
        System.out.println("进不来了aaa");
        return "../test.jsp";
    }
}
