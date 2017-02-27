package com.jd.dp.decorator;

public class ConcreteDecoratorA extends  Decorator {
	 
	private String addedState = "新属性1";
	
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	public void operation() {
		 super.operation();
	     System.out.println("添加属性: " + addedState);
	}
}
