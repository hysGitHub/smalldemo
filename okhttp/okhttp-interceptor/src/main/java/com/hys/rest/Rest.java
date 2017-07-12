package com.hys.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

	@RequestMapping("/ribbin")
	public String ribbin(){
		System.err.println("ribbin");
		return "ribbon";
	}
	
	
	@RequestMapping("/feign")
	public String feign(){
		System.err.println("feign");
		return "feign";
	}
}
