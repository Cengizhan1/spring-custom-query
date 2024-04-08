package com.cengizhanyavuz.springcustomquery.dto;

import com.cengizhanyavuz.springcustomquery.model.User;

import java.util.Date;

public record UserDto(
    String username,
    Boolean active,
    Long salary,
    Date birthDate
) {
    public static UserDto toUserDto(User user) {
        return new UserDto(
                user.getUsername(),
                user.getActive(),
                user.getSalary(),
                user.getBirthDate());
    }
    public static User toUserEntity(UserDto userDto) {
        return new User(
                userDto.username,
                userDto.active,
                userDto.salary,
                userDto.birthDate
        );
    }
}
