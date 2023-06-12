package com.example.AttendanceSystem.service;

import com.example.AttendanceSystem.model.Instructor;
import com.example.AttendanceSystem.repository.InstructorRepository;
import com.example.AttendanceSystem.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public InstructorRepository instructorRepository;
    public Object getOneUserByUserName(String userName) {
        Instructor asd =  instructorRepository.getByUserName(userName);
        return asd;
    }
}
