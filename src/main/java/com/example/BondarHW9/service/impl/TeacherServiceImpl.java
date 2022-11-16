package com.example.BondarHW9.service.impl;

import com.example.BondarHW9.models.group.Group;
import com.example.BondarHW9.models.teacher.Teacher;
import com.example.BondarHW9.repository.GroupRep;
import com.example.BondarHW9.repository.TeacherRep;
import com.example.BondarHW9.service.TeacherService;

import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRep teacherRep;
    private final GroupRep groupRep;

    public TeacherServiceImpl(TeacherRep teacherRep, GroupRep groupRep) {
        this.teacherRep = teacherRep;
        this.groupRep = groupRep;
    }

    @Override
    public void addGroupToTeacher(Group group, Long id) {
        Teacher teacher = teacherRep.findById(id).get();
        teacher.addGroup(group);
        groupRep.save(group);
        teacherRep.save(teacher);
    }

    @Override
    public void deleteGroupFromTeacher(Long groupId) {
        Teacher teacher = groupRep.findById(groupId).get().getTeacher();
        teacher.removeGroup(groupRep.findById(groupId).get());
        teacherRep.save(teacher);
    }

    @Override
    public int teacherNumberOfGroups(Long teacherId) {
        return teacherRep.findById(teacherId).get().getGroups().size();
    }
}
