package com.myApp.AssignmentSubmissionApp.repository;

import com.myApp.AssignmentSubmissionApp.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment,Long> {
}
