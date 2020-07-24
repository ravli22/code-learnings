package com.learning.singlesignonoktaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SingleSignOnOktaSpringBootApplication {

	@GetMapping("/")
	public String home(Principal principal){
		return "Welcome "+principal.getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(SingleSignOnOktaSpringBootApplication.class, args);
	}

}
