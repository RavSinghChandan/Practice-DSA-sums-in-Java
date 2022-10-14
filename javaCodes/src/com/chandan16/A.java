package com.chandan16;

public class A implements Runnable{
 int sum;
 @Override
 public void run() {
	 for(int i=0;i<10;i++) {
		 System.out.println("Inside A Thread");
	 }
 }
}
