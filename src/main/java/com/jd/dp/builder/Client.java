package com.jd.dp.builder;

public class Client {

	public static void main(String[] args) {
		
		
		PersonDirector pd = new PersonDirector();  
		
		Person person = pd.constructPerson(new WomenBuilder());  
		System.out.println(person.getBody());  
		System.out.println(person.getFoot());  
		System.out.println(person.getHead());  
		
		System.out.println("===========");  
		Person person2 = pd.constructPerson(new ManBuilder());  
		System.out.println(person2.getBody());  
		System.out.println(person2.getFoot());  
		System.out.println(person2.getHead());  

	}

}
