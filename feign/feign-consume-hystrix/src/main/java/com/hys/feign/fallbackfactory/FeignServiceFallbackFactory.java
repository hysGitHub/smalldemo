package com.hys.feign.fallbackfactory;

import org.springframework.stereotype.Component;

import com.hys.entity.Bean;
import com.hys.entity.TResponse;
import com.hys.feign.FeignService;

import feign.hystrix.FallbackFactory;

@Component
public class FeignServiceFallbackFactory implements FallbackFactory<FeignService> {

	@Override
	public FeignService create(Throwable cause) {
		
		return new FeignService() {
			
			@Override
			public TResponse<String> test() {
				System.err.println(cause.getMessage());
				return null;
			}
			
			@Override
			public Bean post(Bean bean) {
				return null;
			}
			
			@Override
			public String get2(String id) {
				return null;
			}
			
			@Override
			public String get(String id) {
				System.err.println(cause.getMessage());
				return null;
			}
		};
	}

}
