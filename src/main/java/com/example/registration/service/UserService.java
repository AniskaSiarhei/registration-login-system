package com.example.registration.service;

import com.example.registration.dto.UserDto;
import com.example.registration.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
