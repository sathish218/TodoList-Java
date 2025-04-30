package com.student.StudentManagement.Repository;

import com.student.StudentManagement.Model.student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface studentRepository extends JpaRepository<student,Long>{

}
