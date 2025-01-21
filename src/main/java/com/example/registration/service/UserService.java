package com.example.registration.service;

import com.example.registration.dto.UserDto;
import com.example.registration.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
}
