package com.jd.dp.bridge;

/**
 * @author gongbinglai
 *
 */
public class SpeedWay  extends AbstractRoad{

	  void run() {  
        super.run();  
        aCar.run();  
        System.out.println("在高速公路行驶");  
	  }  
   
	
}
