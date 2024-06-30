package com.myApp.AssignmentSubmissionApp.service;
import com.myApp.AssignmentSubmissionApp.repository.AssignmentRepository;

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
