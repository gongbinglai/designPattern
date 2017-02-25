package com.jd.dp.template;

public class Transfer extends BankTemplateMethod{

	@Override
	protected void transact() {
		System.out.println("转账");
		
	}

	@Override
	protected boolean doLog() {
		
		return true;
	}

}
