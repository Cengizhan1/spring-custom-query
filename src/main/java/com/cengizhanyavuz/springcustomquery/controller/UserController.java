package com.cengizhanyavuz.springcustomquery.controller;

import com.cengizhanyavuz.springcustomquery.dto.UserDto;
import com.cengizhanyavuz.springcustomquery.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("jpa/active")
    public List<UserDto> getActiveUsersJpa() {
        return userService.getActiveUsersJpa();
    }

    @GetMapping("jpql/active")
    public List<UserDto> getActiveUsersJpql() {
        return userService.getActiveUsersJpql();
    }

    @GetMapping("native/active")
    public List<UserDto> getActiveUsersNative() {
        return userService.getActiveUsersNative();
    }

    @GetMapping("/jpa/findByUsernameAndActiveTrue")
    public List<UserDto> findByUsernameAndActiveTrueJpa(@RequestParam String username) {
        return userService.findByUsernameAndActiveTrueJpa(username);
    }

    @GetMapping("/jpql/findByUsernameAndActiveTrue")
    public List<UserDto> findByUsernameAndActiveTrueJpql(@RequestParam String username) {
        return userService.findByUsernameAndActiveTrueJpql(username);
    }

    @GetMapping("/native/findByUsernameAndActiveTrue")
    public List<UserDto> findByUsernameAndActiveTrueNative(@RequestParam String username) {
        return userService.findByUsernameAndActiveTrueNative(username);
    }

    @GetMapping("/jpa/findBySalaryGreaterThan/{salary}")
    public List<UserDto> findBySalaryGreaterThanJPA(@PathVariable long salary) {
        return userService.findBySalaryGreaterThanJPA(salary);
    }

    @GetMapping("/jpql/findBySalaryGreaterThan/{salary}")
    public List<UserDto> findBySalaryGreaterThanJPQL(@PathVariable long salary) {
        return userService.findBySalaryGreaterThanJPQL(salary);
    }

    @GetMapping("/native/findBySalaryGreaterThan/{salary}")
    public List<UserDto> findBySalaryGreaterThanNative(@PathVariable long salary) {
        return userService.findBySalaryGreaterThanNative(salary);
    }

    @GetMapping("/jpa/findBySalaryBetween/{minSalary}/{maxSalary}")
    public List<UserDto> findBySalaryBetweenJPA(@PathVariable long minSalary, @PathVariable long maxSalary) {
        return userService.findBySalaryBetweenJPA(minSalary, maxSalary);
    }

    @GetMapping("/jpql/findBySalaryBetween/{minSalary}/{maxSalary}")
    public List<UserDto> findBySalaryBetweenJPQL(@PathVariable long minSalary, @PathVariable long maxSalary) {
        return userService.findBySalaryBetweenJPQL(minSalary, maxSalary);
    }

    @GetMapping("/native/findBySalaryBetween/{minSalary}/{maxSalary}")
    public List<UserDto> findBySalaryBetweenNative(@PathVariable long minSalary, @PathVariable long maxSalary) {
        return userService.findBySalaryBetweenNative(minSalary, maxSalary);
    }

    @GetMapping("/jpa/countActiveUsers")
    public long countActiveUsersJPA() {
        return userService.countActiveUsersJPA();
    }

    @GetMapping("/jpql/countActiveUsers")
    public long countActiveUsersJPQL() {
        return userService.countActiveUsersJPQL();
    }

    @GetMapping("/native/countActiveUsers")
    public long countActiveUsersNative() {
        return userService.countActiveUsersNative();
    }
}
