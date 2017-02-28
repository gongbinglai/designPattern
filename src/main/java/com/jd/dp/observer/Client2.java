package com.jd.dp.observer;

public class Client2 {

	public static void main(String[] args) {
		
		
        JavaSubject subject = new JavaSubject();
        JavaObserver observer = new JavaObserver();
        
        subject.addObserver(observer);
        
        
       
        subject.change("new state");

	}

}
