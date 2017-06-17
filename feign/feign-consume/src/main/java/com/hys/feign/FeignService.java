package com.hys.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hys.entity.Bean;
import com.hys.entity.TResponse;
/**
 * 默认不能上传附件 
 */
@FeignClient(configuration={},url="http://localhost:8091",decode404=true,name="produce")
@RequestMapping("/from")
public interface FeignService {

	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public String get(@PathVariable("id") String id);
	
	@RequestMapping(value="/get2",method=RequestMethod.GET)
	public String get2(@RequestParam("id") String id);
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public Bean post(Bean bean);
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public TResponse<String> test();
	
}
