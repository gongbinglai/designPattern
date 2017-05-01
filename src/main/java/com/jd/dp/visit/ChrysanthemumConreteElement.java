package com.jd.dp.visit;

public class ChrysanthemumConreteElement implements FlowerElement{

	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}
}
