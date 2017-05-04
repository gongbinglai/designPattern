package com.jd.dp.proxy;

public class RealSubject implements Subject{

	public void request() {
		
		System.out.println("RealSubject request");  
		
	}

	
}
