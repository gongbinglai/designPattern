package com.jd.dp.mediator;

public interface DeptMediator {

	void register(String name,Department d);//记录所有同事类
    
    void command(String name);//发出命令
	
}
