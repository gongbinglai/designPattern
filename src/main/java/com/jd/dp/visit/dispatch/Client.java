package com.jd.dp.visit.dispatch;

public class Client {

	public static void main(String[] args) {
		
		
		Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(wh);
        mozi.ride(bh);

	}

}
