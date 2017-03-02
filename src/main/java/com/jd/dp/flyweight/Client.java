package com.jd.dp.flyweight;

public class Client {

	public static void main(String[] args) {
		
		
		FlyWeightFactory factory = new FlyWeightFactory();
		FlyWeight flya = factory.getFlyWeight("a");
	    
		flya.action("First Call");
	        
		FlyWeight flyb = factory.getFlyWeight("a");
        flyb.action("Second Call");
        
        FlyWeight flyc = factory.getFlyWeight("a");
        flyc.action("Third Call");
	}

}
