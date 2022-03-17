package com.example.API.Spring.Boot.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// <The type, the key>
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
