package com.example.springagain.service;

import com.example.springagain.model.Student;
import com.example.springagain.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
   private final StudentRepository repository;

   public StudentServiceImpl(StudentRepository repository){
       this.repository=repository;
   }
    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return repository.findById(id);
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }

    @Override
    public void updateStudent(int id, Student student) {
        Student oldStudent = repository.findById(id);

        oldStudent.setName(student.getName());
        oldStudent.setAge(student.getAge());
        oldStudent.setCourse(student.getCourse());
    }
}
