package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.dto.InputParams;
import com.example.restapi.dto.OperationResult;

@RestController
public class Calculator {

	@GetMapping("")
	@ResponseBody
	public String home() {
		return "<h1>Spring boot Up and running </h1>";
	}
	
	@GetMapping("add")
	@ResponseBody
	public OperationResult add(@RequestParam double firstOperand, @RequestParam double secondOperand) {
		return new OperationResult( firstOperand + secondOperand);
	}
	
	@PostMapping("subtract")
	@ResponseBody
	public OperationResult subtract(@RequestBody InputParams params) {
		return new OperationResult( params.firstOperand - params.secondOperand);
	}
	
}
