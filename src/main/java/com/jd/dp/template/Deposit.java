package com.jd.dp.template;

public class Deposit extends BankTemplateMethod{

	@Override
	protected void transact() {
		System.out.println("存款");
		
	}

	@Override
	protected boolean doLog() {
		
		return false;
	}

}
