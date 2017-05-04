package com.jd.dp.proxy;

public class ProxySubject implements Subject{

	private RealSubject realSubject = null;  
    
    public void request() {  
        preRequest();
          
        if(realSubject == null){  
            realSubject =  new RealSubject();  
        }  
        realSubject.request();  
          
        postRequest();
    }  
    private void postRequest() {  
       
        System.out.println("postRequest");  
    }  
   
    private void preRequest() {  
       
    	System.out.println("preRequest");    
    }  
	
}
