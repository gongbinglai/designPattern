package com.jd.dp.visit;

public class GladiolusConcreteElement implements  FlowerElement{

	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}

}
