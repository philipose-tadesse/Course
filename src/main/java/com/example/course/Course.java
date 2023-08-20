package com.example.course;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Course{
    @Id
    @GeneratedValue
    private int ID;
    private String Name;
    private int Price;

}