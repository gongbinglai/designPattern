package com.jd.dp.observer;

import java.util.Observable;
import java.util.Observer;

public class JavaObserver implements Observer{

	public void update(Observable o, Object arg) {
		
		System.out.println(o);
		System.out.println(arg);
		
	}
}
