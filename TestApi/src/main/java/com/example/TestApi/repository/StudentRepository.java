package com.example.TestApi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.TestApi.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
