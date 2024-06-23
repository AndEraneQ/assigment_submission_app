package com.myApp.AssignmentSubmissionApp.repository;

import com.myApp.AssignmentSubmissionApp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByLogin(String username);

}
