package com.jd.dp.chain;

public class ConcreteBHandler extends Handler{

	@Override
	public void handleRequest(String param) {
		
		
		if("B".equals(param)){
			this.invoke(param);
		}else{
			
			if(this.getSuccessor()!=null){
				this.getSuccessor().handleRequest(param);
			}else{
				System.out.print("没有可以处理的类了");
			}
			
		}
		
	}

	@Override
	public void invoke(String param) {
		System.out.print("ConcreteHandlerB invoke:"+param);
		
	}



}
