package com.jd.dp.adapter;


/**
 * 类适配器
 * @author gongbinglai
 *
 */
public class ObjectAdapter implements Target{

	private Adaptee adaptee;
	
	
	public ObjectAdapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	
	public void request() {
		
		adaptee.specificRequest();
	}

	


}
