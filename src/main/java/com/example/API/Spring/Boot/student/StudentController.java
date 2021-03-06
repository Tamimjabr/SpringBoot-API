package com.example.API.Spring.Boot.student;

import com.example.API.Spring.Boot.exception.ApiRequestException;
import com.example.API.Spring.Boot.exception.ConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    //  @Autowired to automatically inject the StudentService
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getStudents() {
        return this.studentService.getStudents();
    }

    @PostMapping()
    public void registerNewStudent(@RequestBody Student student) {
        this.studentService.addStudent(student);
    }
}
