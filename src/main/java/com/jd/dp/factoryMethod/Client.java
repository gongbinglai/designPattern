package com.jd.dp.factoryMethod;

public class Client {

	public static void main(String[] args) {
		
		
		String data = "";
       //客户端需要知道由哪个工厂类来创建产品
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("standard");
        ef.export(data);
		

	}

}
