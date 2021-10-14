package com.github.petermue.demo.openapibean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = SpringOpenapiBeanConfigDemoApplication.class)
public class SpringOpenapiBeanConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenapiBeanConfigDemoApplication.class, args);
	}

}
