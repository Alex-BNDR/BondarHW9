package com.example.BondarHW9.repository;

import com.example.BondarHW9.models.group.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRep extends CrudRepository<Group, Long> {
}