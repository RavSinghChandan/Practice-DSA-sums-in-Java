package com.chadan13;

public class X extends Thread{

	@Override
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.println("Inside the run method:"+i);
		}
		System.out.println("Outside the run mehthod");
	}
}
