package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService
{
    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourse()
    {
       return courseRepo.findAll();
    }

    public List<CourseRegistry> allRegistry()
    {
       return courseRegistryRepo.findAll();
    }


    public void addStudent(String name, String email, String courseName)
    {
        CourseRegistry courseRegistry=new CourseRegistry(name,email,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
