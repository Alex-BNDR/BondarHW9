package com.example.BondarHW9.models.teacher;

import com.example.BondarHW9.models.group.Group;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Group> groups = new ArrayList<>();

    public Teacher() {
    }

    public Teacher(String firstName, String secondName) {
        this.firstName = firstName;
        this.lastName = secondName;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
        group.setTeacher(this);
    }

    public void removeGroup(Group group) {
        this.groups.remove(group);
        group.setTeacher(null);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String secondName) {
        this.lastName = secondName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                '}';
    }
}
