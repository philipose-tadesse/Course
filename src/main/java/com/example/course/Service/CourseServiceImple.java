package com.example.course.Service;

import com.example.course.Repository.CourseRepository;
import com.example.course.bindling.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImple implements CourseService{

    @Autowired
    CourseRepository courseRepo;
    @Override
    public String upsert(Course course) {
            courseRepo.save(course);
        return "Success";
    }

    @Override
    public Course getById(Integer CID) {
        Optional<Course> findById = courseRepo.findById(CID);
        return findById.orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public String deleteById(Integer CID) {
        if(courseRepo.existsById(CID)){
          courseRepo.deleteById(CID);
          return "Delete Success";
        }
        return "No Record Found";
    }
}
