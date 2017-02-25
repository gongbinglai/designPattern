package com.jd.dp.abstractFactory;

public class ExportHtmlFactory implements ExportFactory {


	public ExportFile factoryStandardFile() {
		
		return new ExportStandardHtmlFile();
	}

	public ExportFile factoryFinancialFile() {
		
		return new ExportFinancialHtmlFile();
	}

}
