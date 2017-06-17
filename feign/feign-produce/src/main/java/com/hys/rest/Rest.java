package com.hys.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hys.entity.Bean;
import com.hys.entity.TResponse;

@RestController
@RequestMapping("/from")
public class Rest {

	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public String get(@PathVariable String id){
		String res = "res";
		System.err.println(res);
		return res;
	}
	
	@RequestMapping(value="/get2",method=RequestMethod.GET)
	public String get2(@RequestParam("id") String id){
		String res = "res2";
		System.err.println(res);
		return res;
	}
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public Bean post(@RequestBody Bean bean){
		System.err.println(bean);
		return bean;
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST,consumes = "multipart/form-data")
	public boolean upload(@RequestPart("file") MultipartFile file){
		System.err.println(file.getName());
		return true;
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public TResponse<String> test(){
		TResponse<String> res =  new TResponse<String>();
		//String entity = ".-SELECT * FROMStundent WHERE City LIKE 'Ne%";
		String entity = "{\"\"name.:,xixi:-}";
		res.setEntity(entity);
		return res;
	}
}
