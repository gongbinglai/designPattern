package com.jd.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {

		
		//静态代理
		Subject subject = new ProxySubject();
		subject.request(); // 代理者代替真实者做事情
		
		Subject subject2 = new RealSubject();
		subject2.request(); // 代理者代替真实者做事情
		
		
		//动态代理
		System.out.println("====动态代理=====");
		RealSubject rs = new RealSubject();  
        InvocationHandler handler = new DynamicSubject(rs);  

        //以下是分解步骤  
        /* 
        Class c = Proxy.getProxyClass(cls.getClassLoader(), cls.getInterfaces()); 
        Constructor ct = c.getConstructor(new Class[]{InvocationHandler.class}); 
        Subject subject =(Subject) ct.newInstance(new Object[]{handler}); 
        */  
          
        //以下是一次性生成  
        Subject subject3 = (Subject)Proxy.newProxyInstance(rs.getClass().getClassLoader(),rs.getClass().getInterfaces(), handler);  
        subject3.request();  
		
	}

}
