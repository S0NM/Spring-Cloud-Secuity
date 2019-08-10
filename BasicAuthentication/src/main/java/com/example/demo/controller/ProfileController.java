package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/profile/index")
    public String index(){
    	log.info("Loding Profile Index....");
        return "/profile/index";
    }
}
