package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.dao.CourseDao;
import com.nest.courseapp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Coursecontroller {

    @Autowired

    private CourseDao dao;

    @CrossOrigin(origins = "*")

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String Addcourse(@RequestBody Course c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getDuration());

        dao.save(c);


        return "welcome to add employee";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> Viewcourse(){
        return (List<Course>) dao.findAll();
    }
}
