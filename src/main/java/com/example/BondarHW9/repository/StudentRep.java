package com.example.BondarHW9.repository;

import com.example.BondarHW9.models.student.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRep extends CrudRepository<Student, Long> {
}
