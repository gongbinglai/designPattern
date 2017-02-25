package com.jd.dp.abstractFactory;

public class Client {

	public static void main(String[] args) {
		
		
		
        ExportFactory exportFactory = new ExportHtmlFactory();
       
        ExportFile ef = exportFactory.factoryStandardFile();
        
        System.out.println(ef.getClass().getName());
        
        ExportFile ef2 = exportFactory.factoryFinancialFile();
       
        System.out.println(ef2.getClass().getName());
		

	}

}
