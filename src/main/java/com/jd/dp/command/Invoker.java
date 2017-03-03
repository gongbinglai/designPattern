package com.jd.dp.command;

public class Invoker {

	  private Command command = null;
	    public Invoker(Command command){
	        this.command = command;
	    }
	    public void action(){
	    	
	    	
	    	System.out.println("命令交给发送者，命令验证，判断是否需要真正执行命令");
	    	
	        command.execute();
	    }
}
