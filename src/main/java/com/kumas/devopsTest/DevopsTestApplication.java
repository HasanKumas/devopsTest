package com.kumas.devopsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsTestApplication {
//test2 pipeline jenkins
	public static void main(String[] args) {
		SpringApplication.run(DevopsTestApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World11") String name) {
		return String.format("Hello %s!", name);
	}
}
