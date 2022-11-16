package com.example.BondarHW9.web;

import com.example.BondarHW9.models.group.Group;
import com.example.BondarHW9.service.TeacherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/teacheradd")
    public void addGroupToTeacher(@RequestBody Group group, @RequestParam Long id) {
        teacherService.addGroupToTeacher(group, id);
    }

    @DeleteMapping("/deletegroupfromteacher")
    public void deleteGroupFromTeacher(@RequestParam Long id) {
        teacherService.deleteGroupFromTeacher(id);
    }

    @GetMapping("/teachernumberofgroups")
    public int teacherNumberOfGroups(@RequestParam Long id) {
        return teacherService.teacherNumberOfGroups(id);
    }
}
