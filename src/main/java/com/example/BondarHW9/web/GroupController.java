package com.example.BondarHW9.web;

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
        groupService.addStudentToGroup(student , id);
    }

    @DeleteMapping("/deletestudentfromgroup")
    public void deleteStudentFromGroup(@RequestParam Long id){
        groupService.deleteStudentFromGroup(id);
    }
}
