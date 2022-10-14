package com.chandan01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	 
	ArrayList<Student> students  = new ArrayList<>();
	try (Scanner sc = new Scanner(System.in)) {
		int count=1;
		while(true) {
			System.out.println("Enter the student details:-"+count++);
			System.out.println("Enter the roll ");
			int roll = sc.nextInt();
			System.out.println("Enter the name");
			
			String name = sc.next();
			System.out.println("Enter the marks");
			int marks = sc.nextInt();
			
			new Student(roll,name,marks);
			System.out.println("Want more Yes/No?");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("n"))
				break;
			System.out.println("The student details are:");
			System.out.println("======================");
			
			for(Student student1:students) {
				System.out.println("Roll is:-"+student1.getRoll());
				System.out.println("Marks is :-"+student1.getMarks());
				System.out.println("Name is:-"+student1.getName());
			}
			
		}
	}
}
}
