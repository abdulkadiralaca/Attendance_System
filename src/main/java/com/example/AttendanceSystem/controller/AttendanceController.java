package com.example.AttendanceSystem.controller;

import com.example.AttendanceSystem.model.Attendance;
import com.example.AttendanceSystem.service.AttendanceService;
import com.example.AttendanceSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/attendance")

public class AttendanceController {

    private AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @GetMapping
    public List<Attendance> getAllPosts(@RequestParam(name = "courseId") Optional<Long> courseId) {
        return attendanceService.getAllAttendances(courseId);
    }

    
}
