package com.example.BondarHW9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.example.BondarHW9"})
@EntityScan("com.example.BondarHW9")
@EnableJpaRepositories("com.example.BondarHW9")
@Configuration
public class BondarHw9Application {

	public static void main(String[] args) {
		SpringApplication.run(BondarHw9Application.class, args);
	}

}
