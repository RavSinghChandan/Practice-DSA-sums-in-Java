package com.chandan12;

import java.util.ArrayList;
import java.util.List;

public class Mian2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rav");
		list.add("Chandan");
		list.add("Kumar");
		list.add("Singh");

		list.forEach(s -> System.out.println(s));
	}
}
