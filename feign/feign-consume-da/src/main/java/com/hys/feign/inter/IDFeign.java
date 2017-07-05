package com.hys.feign.inter;

import java.lang.annotation.Annotation;

import org.springframework.aop.support.AopUtils;
import org.springframework.cloud.netflix.feign.FeignClient;

import com.hys.feign.FeignService;

/**
 * 
 * @author dell
 * 动态的获取原服务的名称
 */
public interface IDFeign {
	 
	 public default String getName(){
		 String serviceName = null;
		 Class<FeignClient> fclass = FeignClient.class;
		 System.err.println(this);
		// this.getClass().getSuperclass().getDeclaredField("h");
		 Class<?> cc = AopUtils.getTargetClass(this);
		 Annotation[]  annos =  cc.getAnnotations();
		 FeignService fs = ((FeignService)this);
		 Class c =  fs.getClass();
		 System.err.println(c.getTypeName());
		 System.err.println(c.getAnnotatedInterfaces());
		 System.err.println(c.getAnnotatedSuperclass());
		 System.err.println(c.getDeclaredAnnotations());

		 boolean used = fs.getClass().isAnnotationPresent(fclass);//判断是否使用了该注解
		 Annotation[]  anno = fs.getClass().getAnnotations(); //获得所有注解
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
		 if(used){
			 /*Annotation[]  anno = this.getClass().getAnnotations(); //获得所有注解
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
			 }*/
		 }
		 return serviceName;
	 }
}
