package day13.day13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@EnableAutoConfiguration
@SpringBootApplication
@OpenAPIDefinition
@EnableWebMvc
public class Day13Application {

	public static void main(String[] args) {
		SpringApplication.run(Day13Application.class, args);
	}

}
