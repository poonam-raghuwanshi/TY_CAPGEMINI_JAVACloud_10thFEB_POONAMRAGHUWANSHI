package com.tyss.capgemini.threads;

public class PrintingValues {
	public static void main(String[] args) {

		System.out.println("*****Application Started*****");
		// new PrintingMethodClass1().start();
		// new PrintingMethodClass2().start();
		PrintingMethodClass1 printingMethodClass1 = new PrintingMethodClass1();
		try {
			printingMethodClass1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printingMethodClass1.start();
		
		Thread thread = new Thread(new PrintingMethodClass2());

		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
		
		try {
			Thread.sleep(1500);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		

		System.out.println("*****Application Ended*****");

	}

}
