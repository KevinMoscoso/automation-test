package com.cat.automation.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/test")
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<String> testEndpoint(){
        return ResponseEntity.ok("Hello, World!!!");
    }
}