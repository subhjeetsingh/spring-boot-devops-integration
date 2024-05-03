package com.subhjeet.spring.boot.devops.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDevopsIntegrationApplication {


	@GetMapping("/welcome")
	public String getMessage(){
		return "welcome to subhjeet's devops integration";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDevopsIntegrationApplication.class, args);
	}

}
