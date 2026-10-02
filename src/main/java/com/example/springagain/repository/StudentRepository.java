package com.example.springagain.repository;
import com.example.springagain.model.Student;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class StudentRepository {
    private final List<Student> students= new ArrayList<>();

    public List<Student> findAll(){
        return students;
    }
    public Student findById(int id){
        for(Student s : students){
            if(s.getId()==id)
                return s;
        }
        return null ;
    }
    public void save(Student s){
        students.add(s);
    }
    public void deleteById(int id){
                Student s = findById(id);
                students.remove(s);
    }
}
