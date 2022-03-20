package com.example.API.Spring.Boot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

// to be able to inject StudentService into controller
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        // studentRepository.save(student);
        Optional<Student> existedStudent =this.studentRepository.findStudentByEmail(student.getEmail());
        if(existedStudent.isPresent()){
            throw new IllegalStateException("Student with email: "+student.getEmail()+" already exists");
        }
        this.studentRepository.save(student);

    }
}
