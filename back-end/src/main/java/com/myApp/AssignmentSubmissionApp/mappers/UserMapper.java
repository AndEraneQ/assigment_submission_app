package com.myApp.AssignmentSubmissionApp.mappers;

import com.myApp.AssignmentSubmissionApp.dto.UserDto;
import com.myApp.AssignmentSubmissionApp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

}
