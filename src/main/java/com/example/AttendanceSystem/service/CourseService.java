package com.example.AttendanceSystem.service;

import com.example.AttendanceSystem.model.Course;
import com.example.AttendanceSystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course getAllCourses(String userId) {
        List<Course> courseList = new ArrayList<>();
        //List<Course> courseList = courseRepository.getAllById(userId.get());
        Course asd = courseRepository.findByName(userId);
        //System.out.println(asd);
        return asd;
    }


}
