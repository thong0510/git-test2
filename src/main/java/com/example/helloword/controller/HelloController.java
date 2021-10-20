package com.example.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String hello(HttpServletRequest request) {
        request.setAttribute("msg", "Hello Word, i code by spring boot");
        return "hello";
    }
}
