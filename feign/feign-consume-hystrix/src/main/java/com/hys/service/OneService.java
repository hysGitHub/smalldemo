package com.hys.service;

import org.springframework.stereotype.Service;

@Service
public class OneService {

	public String test(){
		System.err.println("test 调用");
		return "test";
	}
}
