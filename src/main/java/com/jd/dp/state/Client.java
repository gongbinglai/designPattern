package com.jd.dp.state;


public class Client {

	public static void main(String[] args) {
		
		
		 //假设路灯开始是绿灯  
        State state = new GreenState();  
        Light light = new Light(state);  
        light.work();  

	}

}
