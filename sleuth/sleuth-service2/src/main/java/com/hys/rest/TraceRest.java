package com.hys.rest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceRest {

	private final Logger logger = Logger.getLogger(TraceRest.class);
	
	@RequestMapping(value="/trace",method=RequestMethod.GET)
	public String trace(){
		
		logger.info("trace2 日志");
		String res = "trace .....";
		return res;
	}
}
