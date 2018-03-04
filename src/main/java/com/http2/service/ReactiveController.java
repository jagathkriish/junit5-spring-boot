package com.http2.service;

import org.springframework.web.bind.annotation.GetMapping;

public class ReactiveController {

	@GetMapping("/persons")
	public String getPerson() {
		return "hello";
	}

}
