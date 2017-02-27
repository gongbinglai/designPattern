package com.jd.dp.mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements DeptMediator{

	
	private Map<String,Department> map=new HashMap<String,Department>();
	
	public void register(String name, Department d) {
		
		map.put(name, d);
		
	}

	public void command(String name) {
		
		map.get(name).ownWork();    
	}

}
