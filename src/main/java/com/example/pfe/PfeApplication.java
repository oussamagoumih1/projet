package com.example.pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class PfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfeApplication.class, args);
	}

}
