package com.hys.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hys.entity.Bean;
import com.hys.entity.TResponse;
import com.hys.feign.FeignService;
import com.hys.feign.FeignUploadService;

@RestController
@RequestMapping("/feign")
public class FeignRest {

	@Autowired
	private FeignService feignService;
	
	@Autowired
	private FeignUploadService feignUploadService;
	
	
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public String get(@PathVariable String id){
		return feignService.get(id);
	}
	
	@RequestMapping(value="/get2",method=RequestMethod.GET)
	public String get2(@RequestParam("id") String id){
		return feignService.get2(id);
	}
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public Bean post(Bean bean){
		return feignService.post(bean);
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public boolean upload(@RequestPart("file") MultipartFile file){
		return feignUploadService.upload(file);
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public TResponse<String> test(){
		TResponse<String> res = feignService.test();
		return res;
	}
}
