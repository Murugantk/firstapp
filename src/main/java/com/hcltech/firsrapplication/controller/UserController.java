package com.hcltech.firsrapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// this is for only hitting the controller url and get the message
@RestController
@RequestMapping("/app")
public class UserController {
	@GetMapping("/methodcall")
	public String callMethod() {
		return "Application perumaley valga";
	}
}
