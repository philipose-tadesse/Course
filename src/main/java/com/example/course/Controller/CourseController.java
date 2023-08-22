package com.example.course.Controller;

import com.example.course.Service.CourseServiceImple;
import com.example.course.bindling.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseServiceImple courseServiceImple;

    @PostMapping("/course")
    public ResponseEntity<String> createCourse(Course course){
        String Status = courseServiceImple.upsert(course);
        return new ResponseEntity<>(Status, HttpStatus.CREATED);
    }
    @DeleteMapping("/course/{CID}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer CID){
        String Status = courseServiceImple.deleteById(CID);
        return new ResponseEntity<>(Status, HttpStatus.ok);
        }
    @GetMapping("/course/{CID}")
    public ResponseEntity<Course> getCourse(@PathVariable Integer CID){
             Course course = courseServiceImple.getById(CID);
            return new ResponseEntity<>(course,HttpStatus.ok);
            }
    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourse() {
        List<Course> courses = courseServiceImple.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.ok);
    }
    @PutMapping("/course")
    public ResponseEntity<String> update(@RequestBody Course course){
        String Status = courseServiceImple.upsert(course);
        return new ResponseEntity<>(Status, HttpStatus.ok);
    }
}
