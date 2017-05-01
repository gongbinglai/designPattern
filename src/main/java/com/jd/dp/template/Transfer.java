package com.jd.dp.template;

public class Transfer extends BankTemplateMethod{

	protected void transact() {
		System.out.println("转账");
	}

	protected boolean doLog() {
		
		return true;
	}

}
