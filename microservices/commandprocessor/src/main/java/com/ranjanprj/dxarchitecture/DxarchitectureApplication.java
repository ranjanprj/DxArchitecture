package com.ranjanprj.dxarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


 @SpringBootApplication 
 @EnableAutoConfiguration
 @ComponentScan(basePackages={"com.ranjanprj.dxarchitecture"})
// @EnableJpaRepositories(basePackages="com.rebataur.restifyml.repositories")
// @EnableTransactionManagement
// @EntityScan(basePackages="com.rebataur.restifyml.entities")
public class DxarchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxarchitectureApplication.class, args);
	}

}
