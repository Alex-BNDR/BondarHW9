package com.example.BondarHW9.rest;

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
        teacherService.addGroup(group, id);
    }

    @DeleteMapping("/deletegroup")
    public void deleteGroupFromTeacher(@RequestParam Long id) {
        teacherService.deleteGroup(id);
    }

    @GetMapping("/numberofgroupsbyteacher")
    public int teacherNumberOfGroups(@RequestParam Long id) {
        return teacherService.numberOfGroupsByTeacher(id);
    }
}
