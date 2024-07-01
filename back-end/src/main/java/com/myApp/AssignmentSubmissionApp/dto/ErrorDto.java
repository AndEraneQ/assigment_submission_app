package com.myApp.AssignmentSubmissionApp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDto {
    private String message;

    public ErrorDto(String message) {
        this.message = message;
    }
}
