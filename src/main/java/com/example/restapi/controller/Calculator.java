package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.dto.InputParams;

@RestController
public class Calculator {

	@GetMapping("add")
	@ResponseBody
	public double add(@RequestParam double firstOperand, @RequestParam double secondOperand) {
		return firstOperand + secondOperand;
	}
	
	@PostMapping("subtract")
	@ResponseBody
	public double subtract(@RequestBody InputParams params) {
		return params.firstOperand - params.secondOperand;
	}
	
}
