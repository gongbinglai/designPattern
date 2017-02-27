package com.jd.dp.visit;

public class Client {

	public static void main(String[] args) {
		
		
		 //组装责任链  
        Handler handlerA = new ConcreteHandler();  
        Handler handlerB = new ConcreteBHandler();  
        handlerA.setSuccessor(handlerB);  
       
        handlerA.handleRequest("C");  

	}

}
