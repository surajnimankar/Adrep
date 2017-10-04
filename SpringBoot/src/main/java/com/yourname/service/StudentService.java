package com.yourname.service;

import com.yourname.repository.StudentRepository;
import com.yourname.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    //@Qualifier("StudentRepositoryImpl")
    @Qualifier("MongoDbRepositoryImpl")
    private StudentRepository studentRepository;

    public Collection<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteStudentById(id);
    }

    public void updateStudent(Student student) {
        studentRepository.updateStudent(student);
    }

    public void insertStudent(Student student) {
        studentRepository.insertStudent(student);
    }
}
