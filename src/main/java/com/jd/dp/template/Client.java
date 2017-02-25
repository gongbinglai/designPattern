package com.jd.dp.template;

public class Client {

	public static void main(String[] args) {
		
		
		BankTemplateMethod bank;
        bank=new Deposit();
        bank.process();
        System.out.println("---------------------------------------");
        bank = new Transfer();
        bank.process();

	}

}
