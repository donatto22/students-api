package com.project.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.models.Student;
import com.project.backend.services.StudentService;

@RestController @RequestMapping(path = "api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() throws Exception {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Long id) throws Exception {
        return studentService.getStudentById(id);
    }

    @GetMapping("/email")
    public Optional<Student> getStudentById(@RequestBody String email) throws Exception {
        return studentService.getStudentByEmail(email);
    }

    @PostMapping
    public boolean createAndUpdateStudent(@RequestBody Student student) throws Exception {
        return studentService.createAndUpdateStudent(student);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable("id") Long id) throws Exception {
        return studentService.deleteStudentById(id);
    }
}
