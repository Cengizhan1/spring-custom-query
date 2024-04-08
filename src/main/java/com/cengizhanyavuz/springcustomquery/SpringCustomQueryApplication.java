package com.cengizhanyavuz.springcustomquery;

import com.cengizhanyavuz.springcustomquery.model.User;
import com.cengizhanyavuz.springcustomquery.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringCustomQueryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCustomQueryApplication.class, args);
	}

	private final UserRepository userRepository;

	public SpringCustomQueryApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Bean
	public CommandLineRunner loadData() {
		return (args) -> {
			userRepository.deleteAll();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			List<User> users = Arrays.asList(
					new User("cengizhan", true, 7500L, sdf.parse("1999-07-01")),
					new User("cansu", true, 5000L, sdf.parse("2001-01-01")),
					new User("mert", false, 7000L, sdf.parse("1992-05-21")),
					new User("elif", true, 6500L, sdf.parse("1988-11-30")),
					new User("burak", true, 4800L, sdf.parse("1995-02-15")),
					new User("zeynep", false, 5600L, sdf.parse("2001-07-19"))
			);
			userRepository.saveAll(users);
		};
	}

}
