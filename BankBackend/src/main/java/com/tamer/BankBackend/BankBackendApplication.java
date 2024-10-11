package com.tamer.BankBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.tamer.BankBackend.controller.WelcomeController")
//@EnableJpaRepositories("com.tamer.repository")
//@EntityScan("com.tamer.model")
public class BankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankBackendApplication.class, args);
	}

}
