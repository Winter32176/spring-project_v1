package com.spring.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = { // for dev purpose while database not created
		DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
})
public class SpringProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

}
