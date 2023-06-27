package com.example.hieuhoa.service;

import com.example.hieuhoa.model.Student;

import java.util.Optional;

public class IStudentService implements IGenericService<Student,Long> {
    @Override
    public Iterable<Student> findAll() {
        return null;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Student> save(Student student) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
