package com.chandan12;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Student> students= new ArrayList<>();
		students.add(new Student(1,"a",1));
		students.add(new Student(2,"b",2));
		students.add(new Student(3,"c",3));
		students.add(new Student(4,"d",4));
		System.out.println(students);
		System.out.println("====================");
		students.removeIf(student-> student.getMarks()<2);
		System.out.println(students);
	}
}
