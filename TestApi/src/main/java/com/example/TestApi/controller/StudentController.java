package com.example.TestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestApi.entity.Student;
import com.example.TestApi.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentService service;
@PostMapping
public Student saveStudent(@RequestBody Student student) {
	return service.saveStudent(student);
}
@GetMapping("/{id}")
public Student getsinglestudent(@PathVariable int id) {
	return service.getsinglestudent(id);
}
@PostMapping("/multiple")
public List<Student> saveMultipleStudent(@RequestBody List<Student> list){
	return service.saveMultipleStudent(list);
}
@GetMapping
public List<Student> getAllRecords(){
	return service.getAllRecords();
}
@PutMapping("/{id}")
public Student updateStudent(@PathVariable int id ,@RequestBody Student student) {
	return service.updateStudent(id,student);
}
@DeleteMapping("/delete/{id}")
public String deleteStudent(@PathVariable int id) {
	return service.deleteStudent(id);
}
}
