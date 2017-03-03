package com.jd.dp.iterator;

/**
 * 抽象容器类
 * @author gongbinglai
 *
 */
public interface Aggregate {

	public void add(Object obj);
	
	
	public MyIterator iterator();
	
	public void remove(Object obj);
}
