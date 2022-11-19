package com.example.BondarHW9.models.student;

import com.example.BondarHW9.models.group.Group;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    private int age;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @JsonBackReference
    private Group group;

    public Student() {
    }

    public Student(String firstName, String secondName, String gender) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.gender = gender;
    }

    public Student(String firstName, String secondName, String gender, Group group) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.gender = gender;

        this.group = group;
    }

    public Student(Long id, String firstName, String secondName, String gender, Group group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.gender = gender;

        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
