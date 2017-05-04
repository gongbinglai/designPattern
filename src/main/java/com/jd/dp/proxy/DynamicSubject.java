package com.jd.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler{

	
	private Object sub; // 真实对象的引用

	public DynamicSubject(Object sub) {
		this.sub = sub;
	}  
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("before calling " + method);   
        method.invoke(sub,args);   
        System.out.println("after calling " + method);   
        return null;   
	}

}
