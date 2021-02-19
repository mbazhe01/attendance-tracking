package com.luv2code.springboot.thymeleafdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

@SpringBootApplication
@ComponentScan({"com.luv2code.springboot.thymeleafdemo"})
@EntityScan("com.luv2code.springboot.thymeleafdemo.entity")
public class ThymeleafdemoApplication {

	 @Bean
	 public Java8TimeDialect java8TimeDialect() {
	      return new Java8TimeDialect();
	 }
	
	public static void main(String[] args) {
		SpringApplication.run(ThymeleafdemoApplication.class, args);
	}

}
