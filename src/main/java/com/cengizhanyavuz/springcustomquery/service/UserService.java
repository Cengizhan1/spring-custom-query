package com.cengizhanyavuz.springcustomquery.service;

import com.cengizhanyavuz.springcustomquery.dto.UserDto;
import com.cengizhanyavuz.springcustomquery.model.User;
import com.cengizhanyavuz.springcustomquery.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getActiveUsersJpa() {
        List<User> users = userRepository.findByActiveTrue();
        return users.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> getActiveUsersJpql() {
        List<User> users = userRepository.findActiveUsersJPQL();
        return users.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> getActiveUsersNative() {
        List<User> users = userRepository.findActiveUsersNative();
        return users.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> findByUsernameAndActiveTrueJpa(String username) {
        List<User> users = userRepository.findByUsernameAndActiveTrue(username);
        return users.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> findByUsernameAndActiveTrueJpql(String username) {
        List<User> users = userRepository.findActiveUsersByUsernameJPQL(username);
        return users.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> findByUsernameAndActiveTrueNative(String username) {
        List<User> users = userRepository.findActiveUsersByUsernameNative(username);
        return users.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> findBySalaryGreaterThanJPA(long salary) {
        List<User> activeUsers = userRepository.findBySalaryGreaterThan(salary);
        return activeUsers.stream().map(UserDto::toUserDto).toList();
    }


    public List<UserDto> findBySalaryGreaterThanJPQL(long salary) {
        List<User> activeUsers = userRepository.findUsersWithSalaryGreaterThanJPQL(salary);
        return activeUsers.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> findBySalaryGreaterThanNative(long salary) {
        List<User> activeUsers = userRepository.findUsersWithSalaryGreaterThanNative(salary);
        return activeUsers.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> findBySalaryBetweenJPA(long minSalary, long maxSalary) {
        List<User> activeUsers = userRepository.findBySalaryBetween(minSalary, maxSalary);
        return activeUsers.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> findBySalaryBetweenJPQL(long minSalary, long maxSalary) {
        List<User> activeUsers = userRepository.findUsersWithSalaryBetweenJPQL(minSalary, maxSalary);
        return activeUsers.stream().map(UserDto::toUserDto).toList();
    }

    public List<UserDto> findBySalaryBetweenNative(long minSalary, long maxSalary) {
        List<User> activeUsers = userRepository.findUsersWithSalaryBetweenNative(minSalary, maxSalary);
        return activeUsers.stream().map(UserDto::toUserDto).toList();
    }

    public long countActiveUsersJPA() {
        return userRepository.countByActiveTrue();
    }

    public long countActiveUsersJPQL() {
        return userRepository.countActiveUsersJPQL();
    }

    public long countActiveUsersNative() {
        return userRepository.countActiveUsersNative();
    }
}
