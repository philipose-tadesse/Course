package com.example.course.Repository;

import com.example.course.bindling.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CourseRepository extends JpaRepository<Course, Serializable> {
}
