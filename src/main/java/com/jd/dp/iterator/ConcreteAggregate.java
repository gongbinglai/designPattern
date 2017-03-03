package com.jd.dp.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ConcreteAggregate implements Aggregate {

	private List list = new ArrayList();  
    public void add(Object obj) {  
        list.add(obj);  
    }  

    public MyIterator iterator() {  
        return new ConcreteIterator(list);  
    }  

    public void remove(Object obj) {  
        list.remove(obj);  
    }  
	
}
