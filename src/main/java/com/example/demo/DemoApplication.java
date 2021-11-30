package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
//    @Bean
//    public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {
//     return new OpenAPI()
//          .info(new Info()
//          .title("sample application API")
//          .version(appVersion)
//          .description(appDesciption)
//          .termsOfService("http://swagger.io/terms/")
//          .license(new License().name("Apache 2.0").url("http://springdoc.org")));
//    }
	
}
