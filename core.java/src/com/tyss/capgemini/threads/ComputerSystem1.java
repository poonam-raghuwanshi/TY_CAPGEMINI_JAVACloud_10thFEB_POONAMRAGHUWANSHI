package com.tyss.capgemini.threads;

public class ComputerSystem1 extends Thread{
	PrintingApplication printingApplication;

	public ComputerSystem1(PrintingApplication localPrintingApplication) {
		this.printingApplication = localPrintingApplication;
	}
    @Override
	public void run() {
		System.err.println(">>>> printing from computerSystem1");
		printingApplication.PrintingDocuments("AnyDocument.pdf", 10);
	}
}
