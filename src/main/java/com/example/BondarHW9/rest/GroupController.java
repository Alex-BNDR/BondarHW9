package com.example.BondarHW9.rest;

import com.example.BondarHW9.models.student.Student;
import com.example.BondarHW9.service.GroupService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/group")
public class GroupController {

    private final GroupService groupService;


    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/groupadd")
    public void addStudentToGroup(@RequestBody Student student , @RequestParam Long id) {
        groupService.addStudent(student , id);
    }

    @DeleteMapping("/deletestudent")
    public void deleteStudentFromGroup(@RequestParam Long id){
        groupService.deleteStudent(id);
    }
}
