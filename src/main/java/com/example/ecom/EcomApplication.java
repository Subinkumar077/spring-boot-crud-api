package com.example.ecom;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}

	@Bean
	ServletRegistrationBean<JakartaWebServlet> h2ConsoleServlet() {
		ServletRegistrationBean<JakartaWebServlet> registration =
				new ServletRegistrationBean<>(new JakartaWebServlet(), "/h2-console/*");
		registration.setName("H2Console");
		registration.setLoadOnStartup(1);
		return registration;
	}

}
