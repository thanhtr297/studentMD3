package com.jwbdcustomermanagement.service;


import com.jwbdcustomermanagement.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {

    private static Map<Integer, Student> student;

    static {
        student = new HashMap<>();
        student.put(1, new Student(1, "John", "john@codegym.vn", "Hanoi"));
        student.put(2, new Student(2, "Bill", "bill@codegym.vn", "Danang"));
        student.put(3, new Student(3, "Alex", "alex@codegym.vn", "Saigon"));
        student.put(4, new Student(4, "Adam", "adam@codegym.vn", "Beijin"));
        student.put(5, new Student(5, "Sophia", "sophia@codegym.vn", "Miami"));
        student.put(6, new Student(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(student.values());
    }

    @Override
    public void save(Student student) {
        StudentServiceImpl.student.put(student.getId(), student);
    }

    @Override
    public Student findById(int id) {
        return student.get(id);
    }

    @Override
    public void update(int id, Student student) {
        StudentServiceImpl.student.put(id, student);
    }

    @Override
    public void remove(int id) {
        student.remove(id);
    }
}
