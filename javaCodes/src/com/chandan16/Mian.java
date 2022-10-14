package com.chandan16;

public class Mian {

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		Thread t = new Thread(a);
		 t.start();
		 
		 t.join();
		 
		int result= a.sum;
		for(int i=0;i<10;i++) {
			System.out.println("Inside the main thread: ");
			System.out.println(result);
		}
		 
	}
}
