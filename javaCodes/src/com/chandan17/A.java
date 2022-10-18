package com.chandan17;

/**
 *  Dead lock code exaple
 *  
 * @author Chandan Kumar
 *
 */
public class A {

	
	public synchronized void funA(B b1) {
		System.out.println("funA(B b1)");
		b1.fun2();
	}
	public synchronized void fun1() {
		System.out.println("fun1()");
	}
}
