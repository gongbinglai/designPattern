package com.jd.dp.simpleFactory;

public class SimpleFactory {

	
	
	public static Product createProduct(String productType){  
        Product product = null;  
          
        if ("A".equals(productType)) {  
            product = new ConcreteProductA();  
        } else if ("B".equals(productType)) {  
            product = new ConcreteProductB();   
        } 
        return product;  
}  
	
}
