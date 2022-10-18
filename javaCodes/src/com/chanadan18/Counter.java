package com.chanadan18;

public class Counter implements Runnable{

	private int c =0;
	
	public void increment() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c++;
	}
	@Override
	public void run() {
		System.out.println();
	}
}
