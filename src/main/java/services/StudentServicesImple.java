package services;


import jakarta.transaction.Transactional;
import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServicesImple implements StudentServices {
    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServicesImple(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }


}
