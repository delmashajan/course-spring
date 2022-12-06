package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Coursecontroller {

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String Addcourse(@RequestBody Course c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getDuration());

        return "welcome to add employee";
    }
    @GetMapping("/view")
    public String Viewcourse(){
        return "welcome to view all courses";
    }
}
