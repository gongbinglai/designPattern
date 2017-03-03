package com.jd.dp.command;

public class ConcreteCommand implements Command{

	  //持有相应的接收者对象
    private Receiver receiver = null;
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    public void execute() {
        
    	receiver.action();
    }

}
