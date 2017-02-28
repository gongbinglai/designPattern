package com.jd.dp.observer;

public class Client {

	public static void main(String[] args) {
		
		
        ConcreteSubject subject = new ConcreteSubject();
        MyObserver observer = new ConcreteObserver();
        subject.attach(observer);
        subject.change("new state");

	}

}
