package com.jd.dp.adapter;

public class Client {

	public static void main(String[] args) {
		
		
		 // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类
        Target adapter = new ClassAdapter();
        adapter.request();
        
        
        System.out.println("======对象适配器=======");
        
        Target adapter2 = new ObjectAdapter(new Adaptee());
        
        adapter2.request();
	}

}
