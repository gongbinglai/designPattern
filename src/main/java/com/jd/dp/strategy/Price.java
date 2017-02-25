package com.jd.dp.strategy;

public class Price {

	 //持有一个具体的策略对象
    private MemberStrategy strategy;
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}
