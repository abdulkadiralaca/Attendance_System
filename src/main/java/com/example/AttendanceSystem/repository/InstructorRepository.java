package com.example.AttendanceSystem.repository;
import com.example.AttendanceSystem.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{
    Instructor getByUserName(String userName);
}
