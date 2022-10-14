package com.chandan06;

public class X implements Intr {

	@Override
	public void sayHello(String name) {
		System.out.println("Welcome name:-" + name);
	}

	public static void main(String[] args) {
		Intr i1 = new X();
		i1.fun1();
		System.out.println(i1.equals(i1));
		Intr.fun2();
	}
}
