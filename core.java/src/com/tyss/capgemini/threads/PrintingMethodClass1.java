package com.tyss.capgemini.threads;

public class PrintingMethodClass1 extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i < 10; i++) {
			System.out.println("Printing Values: " + i);
		}
	}

}
