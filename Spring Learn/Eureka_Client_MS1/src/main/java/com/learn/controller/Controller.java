package com.learn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms1")
public class Controller {
    
    @GetMapping("/info")
    public String info() {
    	return "MicroService1";
    }
    
}
