package com.chandan12;

import java.util.ArrayList;

public class Mian4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.stream().forEach(i->System.out.println(i));
	}
}
