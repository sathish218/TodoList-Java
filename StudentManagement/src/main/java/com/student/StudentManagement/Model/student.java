package com.student.StudentManagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String Name;
    private String className;
    private String age;
    private Long phoneNumber;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public student() {
    }

    public student(String name, String className, String age, Long phoneNumber) {
        this.Name = name;
        this.className = className;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}
