package com.chandan17;

public class B {

	public synchronized void funB(A a1) {
		System.out.println("funB(A a1)");
		a1.fun1();
		
	}
	public synchronized void fun2() {
		System.out.println("fun2() ");
	}
}
