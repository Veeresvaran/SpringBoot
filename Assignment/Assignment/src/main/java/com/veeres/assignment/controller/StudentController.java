package com.veeres.assignment.controller;

import com.veeres.assignment.model.Student;
import com.veeres.assignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/student")
    public ResponseEntity<String> saveStudent(@Valid @RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.ok("Saved");
    }

    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
