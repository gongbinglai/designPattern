package com.jd.dp.template;

public abstract class BankTemplateMethod {

	private void takeNumber(){
        System.out.println("取号排队。");
    }

    protected abstract void transact();

    private void evaluate(){
        System.out.println("反馈评分。");
    }

    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
        if(doLog()){
        	System.out.println("doLog") ;
       }
    }

   protected abstract boolean doLog();


}
