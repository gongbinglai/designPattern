package com.jd.dp.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	public void operation() {
		super.operation();
		AddedBehavior();
	}

	public void AddedBehavior() {

		System.out.println("添加行为");
	}
}
