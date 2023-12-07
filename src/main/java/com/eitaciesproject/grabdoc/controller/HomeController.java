package com.eitaciesproject.grabdoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/grabdoc")
public class HomeController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "<h1>Hello World!!!</h1>";
    }
}
