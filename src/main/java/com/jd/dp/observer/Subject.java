package com.jd.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的被观察者
 * @author gongbinglai
 *
 */
public abstract class Subject {

	 /**
     * 用来保存注册的观察者对象
     */
    private    List<MyObserver> list = new ArrayList<MyObserver>();
    /**
     * 注册观察者对象
     * @param observer    观察者对象
     */
    public void attach(MyObserver observer){
        
        list.add(observer);
        System.out.println("Attached an observer");
    }
    /**
     * 删除观察者对象
     * @param observer    观察者对象
     */
    public void detach(MyObserver observer){
        
        list.remove(observer);
    }
    /**
     * 通知所有注册的观察者对象
     */
    public void nodifyObservers(String newState){
        
        for(MyObserver observer : list){
            observer.update(newState);
            
            System.out.println("============");
            
            observer.update(this);
            
        }
    }

}
