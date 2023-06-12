package com.example.AttendanceSystem.model;

import jakarta.persistence.*;


@Entity
@Table(name = "instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String password;

    private String Email;
    // İhtiyaçlarınıza göre ek özellikler eklenebilir

    // Getter ve Setter metotları

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Constructor metotları

    // toString() metodu
}

