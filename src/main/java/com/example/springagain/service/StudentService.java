package com.example.springagain.service;
import java.util.*;
import com.example.springagain.model.Student;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student getStudentById(int id);
    public void addStudent(Student s);
    public void updateStudent(int id , Student student);
    public void deleteStudent(int id);
}
