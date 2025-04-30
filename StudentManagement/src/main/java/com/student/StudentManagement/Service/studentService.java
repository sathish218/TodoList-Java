package com.student.StudentManagement.Service;

import com.student.StudentManagement.Model.student;
import com.student.StudentManagement.Repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {

    @Autowired
    private studentRepository studentRepository;

    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    public student addStudent(student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public student updateStudent(Long id, student student) {
        Optional<student> existing = studentRepository.findById(id);
        if (existing.isPresent()) {
            student.setId(id);
            return studentRepository.save(student);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }
}
