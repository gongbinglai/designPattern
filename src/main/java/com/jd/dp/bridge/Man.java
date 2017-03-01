package com.jd.dp.bridge;

/**
 * @author gongbinglai
 *
 */
public class Man  extends Person{

	  void run() {  
		super.run();  
        System.out.print("男人开着");  
        this.road.run(); 
	  }  
   
	
}
