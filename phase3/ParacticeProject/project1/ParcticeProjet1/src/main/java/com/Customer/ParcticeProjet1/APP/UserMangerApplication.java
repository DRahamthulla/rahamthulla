package com.Customer.ParcticeProjet1.APP;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Customer.ParcticeProjet1.Services.UserService;
import com.Customer.ParcticeProjet1.Bean.Users;
import com.Customer.ParcticeProjet1.Repository.UserRespossitory;
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses =UserRespossitory.class)
public class UserMangerApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserMangerApplication.class, args);
	}
	
}
