package com.jd.dp.strategy;

public class VipMemberStrategy implements MemberStrategy {

	public double calcPrice(double booksPrice) {
		
		 System.out.println("vip会员8折");
	     return booksPrice*0.8;
	}

}
