package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class TestController {
	 @GetMapping("/hello")
     public String hello(@RequestParam String name) {
         System.out.println("invoked name = " + name);
         return "hello " + name;
     }
}