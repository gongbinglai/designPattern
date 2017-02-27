package com.jd.dp.mediator;

public class Finacial implements Department {

	private DeptMediator m;// 持有中介者对象引用

	public Finacial(DeptMediator m) {
		this.m = m;
		m.register("finacial", this);
	}

	public void ownWork() {
		System.out.println("财务部：负责财务工作！");
	}

	public void outWork() {
		System.out.println("财务部：请求市场部配合！");
        m.command("market");  
	}
}
