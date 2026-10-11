package com.TLP.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class JoblistingApplication {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Job Listing API")
						.description("API Documentation")
						.version("1.0"));
	}

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}
}