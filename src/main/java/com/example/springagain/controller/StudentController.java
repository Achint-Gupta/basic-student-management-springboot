package com.example.springagain.controller;
import com.example.springagain.model.Student;
import com.example.springagain.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service){
        this.service = service;
    }
    @GetMapping("/getAllStudents")
    List<Student> getThem(){
        return service.getAllStudents();
    }
    @GetMapping("/{id}")
    Student getById(@PathVariable int id){
        return service.getStudentById(id);
    }
    @PostMapping("/add")
    void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }
    @PutMapping("/update/{id}")
    void updateStudent(@PathVariable int id , @RequestBody Student student){
        service.updateStudent(id,student);
    }
    @DeleteMapping("/delete/{id}")
    void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }
}
