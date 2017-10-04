package com.yourname.repository;

import com.yourname.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("MongoDbRepositoryImpl")
public class MongoDbRepositoryImpl implements StudentRepository {
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                add(new Student(1, "Suraj From MangoDB", "Cricket"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
