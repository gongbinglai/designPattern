package com.jd.dp.visit;

public abstract class Handler  {

	 protected Handler successor;  
     public Handler getSuccessor() {  
         return successor;  
     }  
     public void setSuccessor(Handler successor) {  
         this.successor = successor;  
     }    
    public abstract void handleRequest(String param);
    
    public abstract void invoke(String param); 

}
