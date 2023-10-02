package com.azure.AzureDevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {
	@GetMapping("/")
	public String getMethod() {
		return "Hello Azure Devops : First Try!";
	}

}
