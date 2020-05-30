package com.jdwa.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by czz on 2020/5/30.
 */
@RestController  //此注解为@ResponseBody与@Controller的合体
//@ResponseBody  //将此注解放在类上，表示该类所有方法均为resetful风格
//@Controller
@RequestMapping("/hello")
public class HelloController {

//    @ResponseBody
    @RequestMapping("/sout")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }
}
