package com.sha.springbootmicroservice1product;

import com.sha.springbootmicroservice1product.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootMicroservice1ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice1ProductApplication.class, args);
	}

}
