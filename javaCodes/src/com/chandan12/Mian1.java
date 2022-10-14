package com.chandan12;

import java.util.function.Consumer;

public class Mian1 {

	public static void main(String[] args) {
		Consumer<Student> c = s -> {

			System.out.println("Roll is" + s.getRoll());
			System.out.println("Name is" + s.getName());
			System.out.println("Marks is" + s.getMarks());
		};
		c.accept(new Student(1, "a", 1));
	}
}
