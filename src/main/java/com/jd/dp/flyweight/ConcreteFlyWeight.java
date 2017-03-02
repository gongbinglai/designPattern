package com.jd.dp.flyweight;

public class ConcreteFlyWeight implements FlyWeight{

	  private String name;
	  public ConcreteFlyWeight(String name) {
	    this.name = name;
	  }

	  public void action(String externalState) {
	    System.out.println("内部状态:"+name+",外部状态:"+externalState);
	  }

}
