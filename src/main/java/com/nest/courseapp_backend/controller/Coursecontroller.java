package com.nest.courseapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Coursecontroller {

    @PostMapping("/")
    public String Addcourse(){
        return "welcome to add employee";
    }
    @GetMapping("/view")
    public String Viewcourse(){
        return "welcome to view all courses";
    }
}
