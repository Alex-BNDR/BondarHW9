package com.example.BondarHW9.service;

import com.example.BondarHW9.models.group.Group;

public interface TeacherService {

    void addGroup(Group group, Long teacherId);

    void deleteGroup(Long groupId);

    int numberOfGroupsByTeacher(Long teacherId);
}