package com.learning.redis.api;


import com.learning.redis.dto.Student;
import com.learning.redis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping()
    public void teste(){
        Student student = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
        studentRepository.save(student);
        Student retrievedStudent = studentRepository.findById("Eng2015001").get();
        retrievedStudent.setName("Richard Watson");
        studentRepository.save(student);
        studentRepository.deleteById(student.getId());

        Student engStudent = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
        Student medStudent = new Student("Med2015001", "Gareth Houston", Student.Gender.MALE, 2);
        studentRepository.save(engStudent);
        studentRepository.save(medStudent);

        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
    }
}
