package com.example.hieuhoa.service;

import com.example.hieuhoa.model.Student;
import com.example.hieuhoa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface IStudentService extends IGenericService<Student,Long> {
}
