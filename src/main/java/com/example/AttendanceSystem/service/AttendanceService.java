package com.example.AttendanceSystem.service;

import com.example.AttendanceSystem.model.Attendance;
import com.example.AttendanceSystem.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {
    @Autowired
    public AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendances(Optional<Long> courseId) {
        return attendanceRepository.findByCourseId(courseId.get());
    }


}
