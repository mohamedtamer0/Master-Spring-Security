package com.tamer.BankBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
//@ComponentScan("com.tamer.BankBackend.controller.WelcomeController")
//@EnableJpaRepositories("com.tamer.repository")
//@EntityScan("com.tamer.model")
@EnableWebSecurity
@EnableMethodSecurity(jsr250Enabled = true,securedEnabled = true)
public class BankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankBackendApplication.class, args);
	}

}
