package com.myApp.AssignmentSubmissionApp.repository;

import com.myApp.AssignmentSubmissionApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
