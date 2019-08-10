package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicRestApiController {

    public PublicRestApiController(){} 

    @GetMapping("/api/public/test1")
    public String test1(){
        return "API Test 1";
    }

    @GetMapping("/api/public/test2")
    public String test2(){
        return "API Test 2";
    }

}
