package com.example.AttendanceSystem.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "attendances")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private LocalDateTime date;

    // İhtiyaçlarınıza göre ek özellikler eklenebilir

    // Getter ve Setter metotları

    // Constructor metotları

    // toString() metodu
}
