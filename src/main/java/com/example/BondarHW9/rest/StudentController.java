package com.example.BondarHW9.rest;

import com.example.BondarHW9.models.student.Student;
import com.example.BondarHW9.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getallstudentsingroup")
    public List<Student> getAllStudentsForTeacher (@RequestParam Long teacherId){
        return studentService.showAllStudentsInGroupByTeacher(teacherId);
    }
}