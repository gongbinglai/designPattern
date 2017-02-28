package com.jd.dp.observer;

public class ConcreteObserver implements  MyObserver{

    private String observerState;
	
	
	public void update(String state) {
        observerState = state;
        System.out.println("ConcreteObserver状态为："+observerState);
		
	}


	public void update(Subject subject) {
		
		System.out.println(subject.getClass().getName());
		
	}

	

}
