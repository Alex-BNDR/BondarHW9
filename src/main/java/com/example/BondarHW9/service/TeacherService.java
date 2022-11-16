package com.example.BondarHW9.service;

import com.example.BondarHW9.models.group.Group;

public interface TeacherService {

    void addGroupToTeacher(Group group, Long teacherId);

    void deleteGroupFromTeacher(Long groupId);

    int teacherNumberOfGroups(Long teacherId);
}