package com.hys.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TraceRest {

	private final Logger logger = Logger.getLogger(TraceRest.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/trace1",method=RequestMethod.GET)
	public String trace(){
		
		logger.info("trace 日志");
		
		return restTemplate.getForObject("http://trace2/trace2", String.class);
	}
}
