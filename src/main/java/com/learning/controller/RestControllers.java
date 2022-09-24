package com.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@GetMapping(value="/greet/{input}")
	public String greetMessage(@PathVariable String input) {
		return "Hello " + input;
	}
	
	@GetMapping(value="/greet")
	public String greetMessage1(@RequestParam String input) {
		return "Hello " + input;
	}
	@GetMapping("/printTables/{number}")
	public String PrintTable(@PathVariable int number) {
		String result="";
		
		for(int i=1;i<=10;i++) {
			result+=number+" X "+ i+" = "+number*i+"\n";
		
		}
		return result;
	}

//	@PostMapping(value="/greeting")
//	public String greetMessage1(@RequestParam String input) {
//		return "Hello " + input;
//	}
}
