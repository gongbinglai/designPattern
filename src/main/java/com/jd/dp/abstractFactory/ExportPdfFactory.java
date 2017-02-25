package com.jd.dp.abstractFactory;

public class ExportPdfFactory implements ExportFactory {

	public ExportFile factoryStandardFile() {
		
		return new ExportStandardPdfFile();
	}

	public ExportFile factoryFinancialFile() {
		
		return new ExportFinancialPdfFile();
	}

}
