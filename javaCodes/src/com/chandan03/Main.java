package com.chandan03;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
 public static void main(String[] args) {
	 
	Set<Student> students = new HashSet<>();
	
	students.add(new Student(1,"a",1));
	students.add(new Student(1,"a",1));
	students.add(new Student(2,"b",2));
	students.add(new Student(2,"c",2));
	System.out.println(students);
}
}
