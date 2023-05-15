package com.brillio.Springbootidentityservice;

import com.brillio.Springbootidentityservice.Repository.UserCredentialRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserCredentialRepository.class)
@EnableDiscoveryClient
public class SpringBootIdentityServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootIdentityServiceApplication.class, args);

	}
	@Bean
	public PasswordEncoder passwordEncoder(){

		return NoOpPasswordEncoder.getInstance();
	}

}
