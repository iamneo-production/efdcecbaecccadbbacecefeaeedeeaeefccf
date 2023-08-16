package com.example.springapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("disp");
    public String display()
    {
        return "Welcome";
    }
}