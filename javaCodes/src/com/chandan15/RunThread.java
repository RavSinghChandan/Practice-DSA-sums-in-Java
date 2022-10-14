package com.chandan15;

public class RunThread implements Runnable{

	@Override
	public void run() {
	String	tname= Thread.currentThread().getName();
	System.out.println("tname is :-"+tname);
	}
	public static void main(String[] args) {
		
		RunThread job = new RunThread();
		
		Thread one = new Thread(job);
		Thread two = new Thread(job);
		
		one.start();
		two.start();
		
		
	}
}
