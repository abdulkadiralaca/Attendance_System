package com.example.AttendanceSystem.model;

import jakarta.persistence.*;


@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;
    // İhtiyaçlarınıza göre ek özellikler eklenebilir

    // Getter ve Setter metotları

    // Constructor metotları

    // toString() metodu
}
