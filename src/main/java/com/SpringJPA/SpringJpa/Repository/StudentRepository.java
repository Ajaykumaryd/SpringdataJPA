package com.SpringJPA.SpringJpa.Repository;

import com.SpringJPA.SpringJpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
