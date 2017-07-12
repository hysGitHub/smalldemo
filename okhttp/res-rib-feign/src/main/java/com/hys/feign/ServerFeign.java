package com.hys.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url="http://localhost:8090",name="server")
public interface ServerFeign {
	
	@RequestMapping("/feign")
	public void feign();
}
