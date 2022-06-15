package com.example.eazyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class Exampl18Application {

	public static void main(String[] args) {
		SpringApplication.run(Exampl18Application.class, args);
	}

}
