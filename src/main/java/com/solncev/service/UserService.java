package com.solncev.service;

import com.solncev.dto.CreateUserRequestDto;
import com.solncev.dto.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserResponseDto> findAll();

    Optional<UserResponseDto> findById(Integer id);

    UserResponseDto create(CreateUserRequestDto userDto);
}
