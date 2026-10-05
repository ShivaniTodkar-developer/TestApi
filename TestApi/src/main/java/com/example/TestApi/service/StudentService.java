package com.example.TestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestApi.entity.Student;
import com.example.TestApi.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository repo;

public Student saveStudent(Student student) {
	return repo.save(student);
}

public Student getsinglestudent(int id) {
	return repo.findById(id).orElseThrow();
}

public List<Student> saveMultipleStudent(List<Student> list) {
	return repo.saveAll(list);
}

public List<Student> getAllRecords() {
	return repo.findAll();
}

public Student updateStudent(int id, Student student) {
	Student oldStudent = repo.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found"));
	if(oldStudent!=null) {
		oldStudent.setName(student.getName());
	}
	return repo.save(oldStudent) ;
}

public String deleteStudent(int id) {
	repo.deleteById(id);
	return "Deleted Successfully of id: "+id;
}
}
