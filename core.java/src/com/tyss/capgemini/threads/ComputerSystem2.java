package com.tyss.capgemini.threads;

public class ComputerSystem2 extends Thread{
	PrintingApplication printingApplication;
	
	public ComputerSystem2(PrintingApplication localPrintingApplication) {
		this.printingApplication= localPrintingApplication;
	}

	@Override
	public void run() {
		System.err.println(">>>> printing from computerSystem2");
		printingApplication.PrintingDocuments("someOtherDocument.pdf", 10);
	}
}
