package com.chandan12;

import java.util.function.Supplier;

public class Mian3 {

	public static void main(String[] args) {
		 
		Supplier<String> s = ()-> "This is from the lambda";
		
		System.out.println(s.get());
		Supplier<Student> s2 = ()-> new Student(1,"a",1);
		System.out.println(s2.get().getMarks());
		System.out.println(s2.get().getRoll());
		System.out.println(s2.get().getName());
	}
}
