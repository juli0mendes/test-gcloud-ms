package com.juli0mendes.testgcloud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juli0mendes.testgcloud.dto.TestResponseDTO;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@GetMapping
	public ResponseEntity<TestResponseDTO> health() {
		
		TestResponseDTO body = new TestResponseDTO("Hello, Osklen in Cloud");
		
		return new ResponseEntity<TestResponseDTO>(body, HttpStatus.OK);
	}
}
