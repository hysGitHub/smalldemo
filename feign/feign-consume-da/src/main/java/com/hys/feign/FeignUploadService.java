package com.hys.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.hys.FeignMultipartSupportConfig;
/**
 * 上传附件 
 */
@FeignClient(configuration={FeignMultipartSupportConfig.class},url="http://localhost:8091",decode404=true,name="produce")
@RequestMapping("/from")
public interface FeignUploadService {

	@RequestMapping(value="/upload",method=RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public boolean upload(@RequestPart("file") MultipartFile file);
	
}
