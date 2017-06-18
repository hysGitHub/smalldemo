package com.hys.feign.fallback;

import org.springframework.stereotype.Component;

import com.hys.entity.Bean;
import com.hys.entity.TResponse;
import com.hys.feign.FeignService;

@Component
public class FeignServiceFallback implements FeignService {

	
	public String get(String id) {
		return null;
	}

	public String get2(String id) {
		return null;
	}

	public Bean post(Bean bean) {
		return null;
	}

	public TResponse<String> test() {
		return null;
	}

}
