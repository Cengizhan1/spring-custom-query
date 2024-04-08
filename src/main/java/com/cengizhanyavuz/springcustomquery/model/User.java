package com.cengizhanyavuz.springcustomquery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "usr")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private Boolean active;
    private Long salary;
    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public User(String username, Boolean active, Long salary, Date birthDate) {
        this.username = username;
        this.active = active;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public User() {

    }
}
