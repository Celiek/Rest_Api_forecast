package com.example.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@SpringBootApplication
@RestController
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

	//just for debug purposes
	@GetMapping("/hello")
	public List<String> hello(){
		return List.of("Hello","World");
	}


}
