package com.jd.dp.bridge;

/**
 * 源对象
 * @author gongbinglai
 *
 */
public class Street  extends AbstractRoad{

	  void run() {  
        super.run();  
        aCar.run();  
        System.out.println("在市区街道行驶");  
	  }  
   
	
}
