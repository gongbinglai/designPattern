package com.jd.dp.builder;

public class WomenBuilder implements PersonBuilder{

	Person person;  
	
    public WomenBuilder() {  
        person = new Women();  
    }  
    public void buildBody() {  
        person.setBody("建造女人的身体");  
    }  
    public void buildFoot() {  
        person.setFoot("建造女人的脚");  
    }  
    public void buildHead() {  
        person.setHead("建造女人的头");  
    }  
    public Person buildPerson() {  
        return person;  
    }  

	
}
