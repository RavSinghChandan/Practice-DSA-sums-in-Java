package com.chandan14;

public class ThreadC extends Thread {

	 @Override
	 public void run() {
		 for(int i =20;i<30;i++) {
			 System.out.println("ThreadC"+i);
		 }
		 System.out.println("End ThreadC");
	 }
	 
	
}
