package com.example.BondarHW9.service;

import com.example.BondarHW9.models.student.Student;

import java.util.List;

public interface StudentService {

    List<Student> showAllStudentsInGroupByTeacher(Long teacherId);
}
