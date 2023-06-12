package com.example.AttendanceSystem.repository;

import com.example.AttendanceSystem.model.Attendance;
import com.example.AttendanceSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long>{
    List<Attendance> findByCourseId(Long course_id);

}
