package com.springboot.example.complete.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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

    /*public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Charan", "charan@mail.com", LocalDate.of(2000, Month.SEPTEMBER, 21), 23),
                new Student(2L, "Baran", "baran@mail.com", LocalDate.of(2001, Month.JULY, 15), 22)
        );
    }*/
}
