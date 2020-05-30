package com.jdwa.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by czz on 2020/5/30.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @ResponseBody
    @RequestMapping("/sout")
    public String hello(){
        return "Hello World!";
    }
}
