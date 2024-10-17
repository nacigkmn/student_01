package com.example.studentapi.controller;

import com.example.studentapi.model.Student;
import com.example.studentapi.service.IStudentService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3000")
public class StudentController {

    private final IStudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>> getAllStudents(){
       return new ResponseEntity<>(studentService.getStudents(), HttpStatus.FOUND);
    }

    @PutMapping("/update/{id}")
    public  Student updateStudent(@RequestBody Student student,@PathVariable Long id){
        return studentService.updateStudent(student,id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
}
