package com.example.API.Spring.Boot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> hello() {
        Student  student1 = new Student(1L, "Tamim",26, "example@hotmail.com", LocalDate.of(1995,8,9));
        Student  student2 = new Student(2L, "Nataly",26, "example2@hotmail.com", LocalDate.of(1995,2,02));
        return List.of(student1, student2);
    }
}
