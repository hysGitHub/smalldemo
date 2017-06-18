package com.hys.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hys.entity.Bean;
import com.hys.entity.TResponse;
import com.hys.feign.fallback.FeignServiceFallback;
/**
 * 默认不能上传附件 
 */
@FeignClient(url="http://localhost:8092",name="produce",fallback=FeignServiceFallback.class)
public interface FeignService {

	@RequestMapping(value="/from/get/{id}",method=RequestMethod.GET)
	public String get(@PathVariable("id") String id);
	
	@RequestMapping(value="/from/get2",method=RequestMethod.GET)
	public String get2(@RequestParam("id") String id);
	
	@RequestMapping(value="/from/post",method=RequestMethod.POST)
	public Bean post(Bean bean);
	
	@RequestMapping(value="/from/test",method=RequestMethod.GET)
	public TResponse<String> test();
	
}
