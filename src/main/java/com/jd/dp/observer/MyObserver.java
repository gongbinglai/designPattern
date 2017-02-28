package com.jd.dp.observer;

/**
 * 具体的观察者
 * @author gongbinglai
 *
 */
public interface MyObserver {

    public void update(String state);
    
    
    public void update(Subject subject);
}
