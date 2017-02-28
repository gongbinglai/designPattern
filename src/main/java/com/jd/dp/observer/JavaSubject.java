package com.jd.dp.observer;

import java.util.Observable;

public class JavaSubject extends  Observable{

	
	private String state;
    
    public String getState() {
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("主题状态为：" + state);
       
        //this.setChanged();
        this.notifyObservers(newState);
        

    }
	
	
}
