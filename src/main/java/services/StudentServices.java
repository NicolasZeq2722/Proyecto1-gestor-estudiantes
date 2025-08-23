package services;

import models.Student;

import java.util.List;

public interface StudentServices {
    public Student findById(Long id);
    public Student save(Student student);
    public void deleteById(Long id);
    public List<Student> findAll();
}
