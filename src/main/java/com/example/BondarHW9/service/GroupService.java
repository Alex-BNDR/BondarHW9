package com.example.BondarHW9.service;

import com.example.BondarHW9.models.student.Student;

public interface GroupService {

    void addStudent(Student student , Long id);

    void deleteStudent(Long studentId);
}