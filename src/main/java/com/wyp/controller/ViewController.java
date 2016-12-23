package com.wyp.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@Controller
@RequestMapping("/view")
public class ViewController {

    @RequestMapping("/test")
    public String view() {
        return "test";
    }

}
