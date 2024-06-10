package com.myApp.AssignmentSubmissionApp.repository;

import com.myApp.AssignmentSubmissionApp.domain.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment,Long> {
}
