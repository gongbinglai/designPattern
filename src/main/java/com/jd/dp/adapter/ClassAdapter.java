package com.jd.dp.adapter;


/**
 * 类适配器
 * @author gongbinglai
 *
 */
public class ClassAdapter extends Adaptee implements Target{

	public void request() {
		
		super.specificRequest();
	}

	


}
