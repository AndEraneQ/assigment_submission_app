package com.myApp.AssignmentSubmissionApp.service;

import com.myApp.AssignmentSubmissionApp.domain.Assignment;
import com.myApp.AssignmentSubmissionApp.domain.User;
import com.myApp.AssignmentSubmissionApp.repository.AssignmentRepository;
import com.myApp.AssignmentSubmissionApp.security.jwt.JwtResponse;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;

//    public Assignment save(JwtResponse jwtResponse) {
//        Assignment assignment = new Assignment();
//        assignment.setStatus("Need to be Submitted");
//        assignment.setUser(jwtResponse.toUser());
//
//        return assignmentRepository.save(assignment);
//    }
}
