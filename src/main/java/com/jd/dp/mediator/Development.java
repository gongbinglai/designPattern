package com.jd.dp.mediator;

public class Development implements Department {

	private DeptMediator m;//持有中介者对象引用
    public Development(DeptMediator m){
        this.m=m;
        m.register("development", this);
    }

    public void ownWork() {
        System.out.println("研发部：负责研发工作！");
    }

    public void outWork() {
        System.out.println("研发部：请求财务部配合！");
        m.command("finacial");
    }
}
