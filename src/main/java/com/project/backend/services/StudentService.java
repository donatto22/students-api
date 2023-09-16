package com.project.backend.services;

import java.util.List;
import java.util.Optional;

import com.project.backend.models.Student;

public interface StudentService {
    public List<Student> getStudents() throws Exception; // get
    public Optional<Student> getStudentById(Long id) throws Exception; // getById
    public Optional<Student> getStudentByEmail(String email) throws Exception; // getByEmail

    public boolean createAndUpdateStudent(Student student) throws Exception; // post and update
    public boolean deleteStudentById(Long id) throws Exception; // delete
}
