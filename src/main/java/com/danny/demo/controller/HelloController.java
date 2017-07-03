package com.danny.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangzq on 2017/7/4.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello";
    }

}
