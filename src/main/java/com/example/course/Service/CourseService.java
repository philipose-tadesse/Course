package com.example.course.Service;

import com.example.course.bindling.Course;

import java.util.List;

public interface CourseService {

      public String upsert(Course course);
      public Course getById(Integer CID);
      public List<Course> getAllCourses();
      public String deleteById(Integer CID);


}
