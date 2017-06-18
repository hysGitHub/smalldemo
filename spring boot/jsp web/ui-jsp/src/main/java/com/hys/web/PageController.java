package com.hys.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author hys
 *
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String index(ModelMap map){
		map.put("title", "hys");
		return "index";
	}
	
	@RequestMapping(value="/upload/upload",method=RequestMethod.POST)
	public String toUppload(@RequestParam String charset,@RequestParam Integer tiao,
			@RequestParam Integer time, ModelMap map,@RequestParam("file") MultipartFile file){
		List<String> list = new ArrayList<String>();
		for(int i = 0;i<10;i++){
			list.add(i+"");
		}
		map.addAttribute("lists", list);
		return "upload/upload";
	}
	
}
