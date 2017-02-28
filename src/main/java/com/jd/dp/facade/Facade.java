package com.jd.dp.facade;


/**
 * 子系统C
 * @author gongbinglai
 *
 */
public  class Facade  {

	ModuleA a = new ModuleA();
	ModuleB b = new ModuleB();
	ModuleC c = new ModuleC();
	
	public void test(){
        
        a.testA();
        b.testB();
        c.testC();
    }
	
	public void test2(){
        
        a.testA();
        c.testC();
    }
}
