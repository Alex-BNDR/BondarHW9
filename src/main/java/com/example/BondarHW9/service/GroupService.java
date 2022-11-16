package com.example.BondarHW9.service;

import com.example.BondarHW9.models.student.Student;

public interface GroupService {

    void addStudentToGroup(Student student , Long id);

    void deleteStudentFromGroup(Long studentId);
}