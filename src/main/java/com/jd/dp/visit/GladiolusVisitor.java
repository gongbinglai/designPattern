package com.jd.dp.visit;

public class GladiolusVisitor implements Visitor{

	public void visit(GladiolusConcreteElement gladiolus) {
		System.out.println(this.getClass().getSimpleName() + " access " + gladiolus.getClass().getSimpleName());
		
	}

	public void visit(ChrysanthemumConreteElement chrysanthemum) {
		System.out.println(this.getClass().getSimpleName() + " access " + chrysanthemum.getClass().getSimpleName());
		
	}

}
