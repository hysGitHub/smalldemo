package com.hys.rest;

import org.apache.log4j.Logger;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceRest {

	private final Logger logger = Logger.getLogger(TraceRest.class);


	@RequestMapping(value = "/trace2", method = RequestMethod.GET)
	public String trace() {

		logger.info("trace 日志");

		return "lalal";
	}

	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}
}
