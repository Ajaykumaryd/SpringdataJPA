package com.SpringJPA.SpringJpa.Repository;

import com.SpringJPA.SpringJpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudentRepositoryTest {


    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudent(){
     Student student=Student.builder
             .email
    }

}