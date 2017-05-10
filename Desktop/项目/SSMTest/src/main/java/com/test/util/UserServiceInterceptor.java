package com.test.util;

import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.domain.User;
@Component
@Aspect
public class UserServiceInterceptor {

	public static final Logger log = Logger.getLogger(UserServiceInterceptor.class);
	
	//将缓存客户端工具类 MemcachedCache 织入进来 
	@Autowired
    private MemcachedClient memcachedClient;
	 
	  
	  //* 定义pointcunt 
	    
	 @Pointcut("execution(* com.test.service.imp.UserServiceImp.*(..))")  
	 public void aPointcut() {  
	  
	 }  
	 /** 
	  * 环绕装备 用于拦截查询 如果缓存中有数据，直接从缓存中读取；否则从数据库读取并将结果放入缓存 
	  *  
	  * @param call 
	  * @param name 
	  * @return 
	  */
	 @Around("aPointcut()&&args(id)")  
	 public User doFindUserByNameAround(ProceedingJoinPoint call, long id) {  
	  User user = null; 
	  try {
		if (memcachedClient.get("findUserByName_" + id)!=null) {  
			  user = (User) memcachedClient.get("findUserByName_" + id);  
		   log.debug("从缓存中读取！findUserByName_" + id);
		   System.out.println("从缓存中读取！");
		  } else {  
		   try {  
			   user = (User)call.proceed();  
		    if (user != null) {  
		    	memcachedClient.set("findUserByName_" + id,0, user);  
		     log.debug("缓存装备被执行：findUserByName_" + id); 
		     System.out.println("缓存装备被执行！");
		    }  
		   } catch (Throwable e) {  
		    e.printStackTrace();  
		   }  
		  }
	} catch (TimeoutException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MemcachedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	  return user;  
	   
	}  
}
