package com.solncev.service;

import com.solncev.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    List<UserResponseDto> findAll();
}
