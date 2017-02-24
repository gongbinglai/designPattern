package com.jd.dp.simpleFactory;

public class Client {

	public static void main(String[] args) {
		
		
		Product p = SimpleFactory.createProduct("B");
		
		System.out.println(p.getClass());
		
		

	}

}
