package com.hys.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hys.feign.ServerFeign;

@RestController
public class ConsumerRest {

	@Autowired
	private ServerFeign serverFeign;
	
	@Autowired
	private RestTemplate restTemplate;
	 
	@RequestMapping("/server/ribbin")
	public void ribbin(){
		String s = restTemplate.getForObject("http://localhost:8090/", String.class);
		System.err.println(s);

	}
	
	
	@RequestMapping("/server/feign")
	public void feign(){
		serverFeign.feign();
	}

}
