package com.example.studentapi.service;

import com.example.studentapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student,Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
