package com.jwbdcustomermanagement.service;


import com.jwbdcustomermanagement.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void save(Student student);

    Student findById(int id);

    void update(int id, Student student);

    void remove(int id);
}
