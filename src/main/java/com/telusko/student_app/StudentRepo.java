package com.telusko.student_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
