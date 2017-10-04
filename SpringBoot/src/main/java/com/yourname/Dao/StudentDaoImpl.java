package com.yourname.Dao;

import com.yourname.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("StudentDaoImpl")
public class StudentDaoImpl implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1,"Suraj", "Computer Science"));
                put(2, new Student(2,"Sachin", "Mechanical"));
                put(3, new Student(3,"Pranav", "Eletronics"));
                put(4, new Student(4,"Mayur", "Civil"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student std = this.students.get(student.getId());
        std.setCourse(student.getCourse());
        std.setName(student.getName());
        this.students.put(student.getId(), std);


    }

    @Override
    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
