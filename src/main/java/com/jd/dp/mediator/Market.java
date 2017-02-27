package com.jd.dp.mediator;

public class Market implements Department {

	private DeptMediator m;// 持有中介者对象引用

	public Market(DeptMediator m) {
		this.m = m;
		m.register("market", this);
	}

	public void ownWork() {
		System.out.println("市场部：负责项目承接工作！");
	}

	public void outWork() {
		System.out.println("市场部：请求研发部门配合！");
		m.command("development");
	}
}
