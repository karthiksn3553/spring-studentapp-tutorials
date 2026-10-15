package com.telusko.student_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @GetMapping("/getstudents")
    public List<Student> getallStudent(){
        return repo.findAll();
    }

    @RequestMapping("/addstudents")
    public void addtheStudent(){
        //add student
        Student s=new Student();
        s.setName("Karthik");
        s.setAge(24);

        repo.save(s);
    }
}
