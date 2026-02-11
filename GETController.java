package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GETController {

	@GetMapping("/info")
	public Map<String, Object> getInfo() {
		return Map.of(
				"student", "Sagandykov Akezhan",
				"course", "Spring Framework",
				"week", 1
		);
	}
}