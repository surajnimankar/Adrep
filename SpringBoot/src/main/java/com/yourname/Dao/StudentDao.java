package com.yourname.Dao;

import com.yourname.entity.Student;

import java.util.Collection;

public interface StudentDao {

    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
