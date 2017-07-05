package com.hys.feign.inter;

import java.lang.annotation.Annotation;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author dell
 * 动态的获取原服务的名称
 */
public interface IDFeign {
	 
	 public default String getName(){
		 String serviceName = null;
		 Class<FeignClient> fclass = FeignClient.class;
		 boolean used = this.getClass().isAnnotationPresent(fclass);//判断是否使用了该注解
		 if(used){
			 Annotation[]  anno = this.getClass().getAnnotations(); //获得所有注解
			 for(Annotation an : anno){
				 if(an.annotationType().equals(fclass)){
					 //解析feignClient 
					 FeignClient anf = (FeignClient)an;
					 serviceName = anf.name();//微服务的名称
					 String url = anf.url();
					 System.err.println(serviceName);
					 System.err.println(url);
				 };
				 System.err.println(an);
			 }
		 }
		 return serviceName;
	 }
}
