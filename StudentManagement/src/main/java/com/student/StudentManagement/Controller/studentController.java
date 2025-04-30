package com.student.StudentManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.student.StudentManagement.Service.studentService;
import com.student.StudentManagement.Model.student;

import java.util.List;

@RestController
@RequestMapping("/api/studentList")
public class studentController {

    @Autowired
    private studentService studentService;

    @GetMapping
    public List<student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public student addStudent(@RequestBody student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public student updateStudent(@PathVariable Long id, @RequestBody student student) {
        return studentService.updateStudent(id, student);
    }
}
