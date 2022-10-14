package com.chandan14;

public class ThreadA extends Thread {
 @Override
 public void run() {
	 for (int i =0;i<10;i++) {
		 System.out.println("ThradA"+i);
		 
	 }
	 System.out.println("End of threadA");
 }
}
