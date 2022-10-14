package com.chandan06;

@FunctionalInterface
public interface Intr {

	void sayHello(String name);

	boolean equals(Object object);

	default void fun1() {

		System.out.println("Inside the functional intr of def.");

	}

	static void fun2() {
		System.out.println("Insdie the intr of static method");
	}

}
