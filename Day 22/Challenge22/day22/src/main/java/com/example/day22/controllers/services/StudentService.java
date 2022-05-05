package com.example.day22.controllers.services;

import java.util.ArrayList;

import com.example.day22.controllers.repositories.StudentRepository;
import com.example.day22.models.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;

    public ArrayList<Student> getUsers(){
        return (ArrayList<Student>) studentRepository.findAll();
    }

    public void saveUser(Student student){
        studentRepository.save(student);
    }
}
