package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController
{
    @Autowired
    CourseService courseService;


    @GetMapping("Course")
    public List<Course> availableCourse()
    {
     return courseService.availableCourse();
    }

    @GetMapping("Course/Registry")
    public List<CourseRegistry> allRegistry()
    {
        return courseService.allRegistry();
    }

    @PostMapping("Course/Register")
    public String addStudent(@RequestParam ("name") String name,@RequestParam("emailId") String email,@RequestParam("courseName") String courseName)
    {

        courseService.addStudent(name,email,courseName);
        return "Added";
    }
}
