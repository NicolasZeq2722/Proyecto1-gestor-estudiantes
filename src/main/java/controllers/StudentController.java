package controllers;

import models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repositories.StudentRepository;
import services.StudentServices;
import services.StudentServicesImple;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentServices studentServices;

    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @PostMapping("/students")
    public Student save(@RequestBody Student student) {
        return studentServices.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentServices.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) {
        return studentServices.findById(id);
    }

    @PutMapping("/{id}")
    public Student updateById(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return studentServices.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@RequestBody Long id) {
        studentServices.deleteById(id);
    }




}