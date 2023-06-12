package com.example.AttendanceSystem.controller;


import com.example.AttendanceSystem.model.Course;
import com.example.AttendanceSystem.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/courses")
public class CourseController {
    CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public Course getAllCourses(@RequestParam(name = "userId") String userId) {
        return courseService.getAllCourses(userId);
    }
}
