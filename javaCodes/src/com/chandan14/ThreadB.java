package com.chandan14;

public class ThreadB extends Thread {
@Override
public void run() {
	for (int i =50;i<60;i++) {
		System.out.println("ThreadB"+i);
	}
	System.out.println("End ThreadB");

}
}
