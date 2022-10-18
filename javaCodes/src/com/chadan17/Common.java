package com.chadan17;

public class Common {

	public void fun1(String name) {
		System.out.println("Welcome");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Common c = new Common();
		c.fun1("Chandan");
	}
}
