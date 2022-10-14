package com.chandan08;

public class MyClass {

	public static void main(String[] args) {

		Calculator plusOperation = (a, b) -> a + b;
		Calculator minusOperation = (a, b) -> a - b;

		System.out.println(plusOperation.calculate(1, 2));
		System.out.println(minusOperation.calculate(2, 3));
	}

}
