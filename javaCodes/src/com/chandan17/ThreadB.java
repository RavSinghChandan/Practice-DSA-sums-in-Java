package com.chandan17;

public class ThreadB extends Thread {

	A a1;
	B b1;
	public ThreadB(A a1,B b1) {
		this.a1 = a1;
		this.b1= b1;
		
	}
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		b1.funB(a1);
	}
}
