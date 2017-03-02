package com.jd.dp.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 目标对象
 * @author gongbinglai
 *
 */
public class FlyWeightFactory {

	 private static ConcurrentHashMap<String, FlyWeight> allFlyWeight = new ConcurrentHashMap<String, FlyWeight>();
	 
	  public static FlyWeight getFlyWeight(String name) {
	    if (allFlyWeight.get(name) == null) {
	      synchronized (allFlyWeight) {
	        if (allFlyWeight.get(name) == null) {
	          System.out.println(name+"对应的享元对象不存在，创建对象");
	          FlyWeight flyWeight = new ConcreteFlyWeight(name);
	          allFlyWeight.put(name, flyWeight);
	        }
	      }
	    }else{
	    	
	    	 System.out.println(name+"对应的享元对象存在:"+allFlyWeight.get(name));
	    	
	    }
	    return allFlyWeight.get(name);
	  }
}
