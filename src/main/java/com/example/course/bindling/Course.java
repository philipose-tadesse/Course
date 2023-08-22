package com.example.course.bindling;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Course_Tabel")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CID;
    private String Name;
    private Double price;
}
