package com.example.AttendanceSystem.repository;

import com.example.AttendanceSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    Course findByName(String name);
    //List<Course> getAllById(Long Id);

}
