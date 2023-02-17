package com.mydevcav.udemyjavaspringframework;

import jakarta.validation.Validator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class UdemyJavaSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyJavaSpringFrameworkApplication.class, args);
	}

	@Bean
	public Validator validator() {
		return new LocalValidatorFactoryBean();
	}

}
