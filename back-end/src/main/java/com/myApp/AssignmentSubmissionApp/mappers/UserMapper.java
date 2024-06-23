package com.myApp.AssignmentSubmissionApp.mappers;

import com.myApp.AssignmentSubmissionApp.domain.User;
import com.myApp.AssignmentSubmissionApp.dto.SignUpDto;
import com.myApp.AssignmentSubmissionApp.dto.UserDto;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

//    @Mapping(target = "password", ignore = true)
//    User signUpToUser(SignUpDto signUpDto);

}
