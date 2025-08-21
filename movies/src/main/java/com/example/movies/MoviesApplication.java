package com.example.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // Marks this class as a REST API controller
public class MoviesApplication{

    @GetMapping("/")      // Base URL for all endpoints here
    public static  String apiRoot(){
        return  "hello";
    }
	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
		







		
	}

}
