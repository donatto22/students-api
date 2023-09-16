package com.project.backend.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.backend.models.Student;
import com.project.backend.repository.StudentRepository;
import com.project.backend.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() throws Exception {
        try {
            return studentRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Optional<Student> getStudentById(Long id) throws Exception {
        try {
            return studentRepository.findById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Optional<Student> getStudentByEmail(String email) throws Exception {
        try {
            return studentRepository.findByEmail(email);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean createAndUpdateStudent(Student student) throws Exception {
        try {
            studentRepository.save(student);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean deleteStudentById(Long id) throws Exception {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
}
