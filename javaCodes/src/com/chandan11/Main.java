package com.chandan11;

public class Main {

	public static void fun1(String s) {
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		Intr i1 = Main::fun1;
		i1.sayHello("Chandan Kumar singh");
	}
}
