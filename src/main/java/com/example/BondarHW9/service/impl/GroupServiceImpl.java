package com.example.BondarHW9.service.impl;

import com.example.BondarHW9.models.group.Group;
import com.example.BondarHW9.models.student.Student;
import com.example.BondarHW9.repository.GroupRep;
import com.example.BondarHW9.repository.StudentRep;
import com.example.BondarHW9.service.GroupService;

import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupRep groupRep;
    private final StudentRep studentRep;

    public GroupServiceImpl(GroupRep groupRep, StudentRep studentRep) {
        this.groupRep = groupRep;
        this.studentRep = studentRep;
    }

    @Override
    public void addStudent(Student student, Long id) {
        Group group = groupRep.findById(id).get();
        group.addStudent(student);
        groupRep.save(group);
    }

    @Override
    public void deleteStudent(Long studentId) {
        Group group = studentRep.findById(studentId).get().getGroup();
        group.removeStudent(studentRep.findById(studentId).get());
        groupRep.save(group);
    }
}
