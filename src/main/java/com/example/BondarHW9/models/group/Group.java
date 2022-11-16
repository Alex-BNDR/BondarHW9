package com.example.BondarHW9.models.group;

import com.example.BondarHW9.models.student.Student;
import com.example.BondarHW9.models.teacher.Teacher;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student> students = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    @JsonBackReference
    private Teacher teacher;

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public Group(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        student.setGroup(this);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
        student.setGroup(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "UniversityGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

}
