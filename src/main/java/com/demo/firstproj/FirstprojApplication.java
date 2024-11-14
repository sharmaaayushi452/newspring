package com.demo.firstproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
public class FirstprojApplication {
	@GetMapping(" /redirect")
	public String redirectTooldFile() {
		return "redirect:/index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstprojApplication.class, args);
	}

}
