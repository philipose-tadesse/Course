package com.example.course;

import java.util.List;

public class CourseController {

    CourseRepository cr = new CourseRepository();
    public Course addCourse(){
        List<Course> CourseRe = cr.getCourses();

        for(Course cs : CourseRe ){
            System.out.println(cs.getName());
        }
    }
}
