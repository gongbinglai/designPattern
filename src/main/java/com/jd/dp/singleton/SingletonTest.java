package com.jd.dp.singleton;


public class SingletonTest {

	
   public static void main(String args[]){
	   
//	   Singleton singleton = Singleton.getInstance();
//	   singleton.sayHello();
	   
//	   StaticInnerClassSingleton singleton = StaticInnerClassSingleton.getInstance();
//	   singleton.sayHello();
	   
	   
	   SingletonEnum singleton = SingletonEnum.INSTANCE;
	   
	   singleton.sayHello();
   }


}

class Singleton{
    private volatile static Singleton singleton = null;
    private Singleton()  { }
    
    
    public static Singleton getInstance()   {
        if (singleton== null)  {
            synchronized (Singleton.class) {
                if (singleton== null)  {
                    singleton= new Singleton();
                }
            }
        }
        return singleton;
    }
    
    
    public void sayHello(){
    	System.out.println("sayHello Singleton");
    }
    
}




class StaticInnerClassSingleton{
	  private static class SingletonHolder {
	        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
	    }
	    private StaticInnerClassSingleton (){}
	    public static final StaticInnerClassSingleton getInstance() {
	        return SingletonHolder.INSTANCE;
	    }
    
    public void sayHello(){
    	System.out.println("sayHello Singleton");
    }
    
}



enum SingletonEnum{
	   INSTANCE;
	   
	   public void sayHello(){
	    	System.out.println("sayHello Singleton");
	    }  
}














