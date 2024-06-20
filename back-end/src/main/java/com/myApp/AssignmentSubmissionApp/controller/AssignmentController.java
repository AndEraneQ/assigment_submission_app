package com.myApp.AssignmentSubmissionApp.controller;

import com.myApp.AssignmentSubmissionApp.domain.Assignment;
import com.myApp.AssignmentSubmissionApp.domain.User;
import com.myApp.AssignmentSubmissionApp.security.jwt.JwtResponse;
import com.myApp.AssignmentSubmissionApp.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("")
    public ResponseEntity<?> createAssignment (@AuthenticationPrincipal JwtResponse jwtResponse) {
        Assignment newAssignment = assignmentService.save(jwtResponse);

        return ResponseEntity.ok(newAssignment);
    }
}
