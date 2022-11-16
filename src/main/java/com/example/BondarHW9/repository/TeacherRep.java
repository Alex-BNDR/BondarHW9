package com.example.BondarHW9.repository;

import com.example.BondarHW9.models.teacher.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRep extends CrudRepository<Teacher, Long> {
}
