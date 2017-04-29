package com.jd.dp.state;

public class GreenState implements State{

	 private static final Long SLEEP_TIME = 2000L;  
	   
	 public void change(Light light) {  
	          
	        System.out.println("现在是绿灯，可以通行");  
	        //绿灯亮1秒  
	        try {  
	            Thread.sleep(SLEEP_TIME);  
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }  
	        light.setState(new YellowState());  
	    }  
}
