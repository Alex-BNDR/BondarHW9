package com.example.BondarHW9.service.impl;

import com.example.BondarHW9.models.group.Group;
import com.example.BondarHW9.models.student.Student;
import com.example.BondarHW9.repository.TeacherRep;
import com.example.BondarHW9.service.StudentService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final TeacherRep teacherRep;

    public StudentServiceImpl(TeacherRep teacherRep) {
        this.teacherRep = teacherRep;
    }

    @Override
    public List<Student> showAllStudentsInGroupByTeacher(Long teacherId) {
        List<Student> studentList = new ArrayList<>();
        List<Group> groups = new ArrayList<>();
        groups.addAll(teacherRep.findById(teacherId).get().getGroups());
        for (int i = 0; i < groups.size(); i++) {
            studentList.addAll(groups.get(i).getStudents());
        }
        return studentList;
    }
}
