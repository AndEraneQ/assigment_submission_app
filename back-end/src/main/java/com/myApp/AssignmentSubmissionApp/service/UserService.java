package com.myApp.AssignmentSubmissionApp.service;

import com.myApp.AssignmentSubmissionApp.domain.User;
import com.myApp.AssignmentSubmissionApp.dto.UserDto;
import com.myApp.AssignmentSubmissionApp.dto.SignInDto;
import com.myApp.AssignmentSubmissionApp.dto.SignUpDto;
import com.myApp.AssignmentSubmissionApp.exception.AppException;
import com.myApp.AssignmentSubmissionApp.mappers.UserMapper;
import com.myApp.AssignmentSubmissionApp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final UserMapper userMapper;

    public UserDto login(SignInDto signInDto) {
        User user = userRepository.findByLogin(signInDto.getLogin())
                .orElseThrow(() -> new AppException("Unknown user", HttpStatus.NOT_FOUND));

        if (passwordEncoder.matches(CharBuffer.wrap(signInDto.getPassword()), user.getPassword())) {
            return userMapper.toUserDto(user);
        }
        throw new AppException("Invalid password", HttpStatus.BAD_REQUEST);
    }

//    public UserDto register(SignUpDto signUpDto) {
//        Optional<User> optionalUser = userRepository.findByLogin(signUpDto.getLogin());
//
//        if (optionalUser.isPresent()) {
//            throw new AppException("Login already exists", HttpStatus.BAD_REQUEST);
//        }
//
//        User user = userMapper.signUpToUser(signUpDto);
//        user.setPassword(passwordEncoder.encode(CharBuffer.wrap(signUpDto.getPassword())));
//
//        User savedUser = userRepository.save(user);
//
//        return userMapper.toUserDto(savedUser);
//    }

    public UserDto findByLogin(String login) {
        User user = userRepository.findByLogin(login)
                .orElseThrow(() -> new AppException("Unknown user", HttpStatus.NOT_FOUND));
        return userMapper.toUserDto(user);
    }

}
