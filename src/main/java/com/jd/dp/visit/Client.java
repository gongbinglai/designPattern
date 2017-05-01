package com.jd.dp.visit;


public class Client {

	public static void main(String[] args) {
		
		
		ObjectStructure os = new ObjectStructure();
		
		os.addElement(new GladiolusConcreteElement());
		os.addElement(new ChrysanthemumConreteElement());
		
		Visitor visitor = new GladiolusVisitor();
		os.accept(visitor);

	}
}
