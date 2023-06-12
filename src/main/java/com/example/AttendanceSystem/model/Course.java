package com.example.AttendanceSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // İhtiyaçlarınıza göre ek özellikler eklenebilir

    // Getter ve Setter metotları

    // Constructor metotları

    // toString() metodu
}

