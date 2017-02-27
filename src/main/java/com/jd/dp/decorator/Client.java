package com.jd.dp.decorator;

public class Client {

	public static void main(String[] args) {
		
		Component component = new ConcreteComponent();

        component.operation();

        System.out.println("======================================");

        Decorator decoratorA = new ConcreteDecoratorA(component);

        decoratorA.operation();

        System.out.println("======================================");

        Decorator decoratorB = new ConcreteDecoratorB(decoratorA);

        decoratorB.operation();
	}

}
