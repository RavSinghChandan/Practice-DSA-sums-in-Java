package com.chadan13;

public class Main {

	public static void main(String[] args) {
		
		X x1 = new X();
		x1.run();
		x1.start();
		for(int i=25;i<60;i++) {
			System.out.println("Inside the main method:"+i);
		}
		System.out.println("Outside the main method:");
	}
}
