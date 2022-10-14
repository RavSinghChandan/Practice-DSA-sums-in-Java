package com.chandan02;

import java.util.LinkedHashSet;

public class Main {
 public static void main(String[] args) {
	  //HashSet<String> hs = new HashSet<>();
	 LinkedHashSet<String> hs = new LinkedHashSet<>();
	 System.out.println(hs);
	  hs.add("a");
	  hs.add("b");
	  hs.add( "c");
	  hs.add("d");
	  hs.add(null);
	  System.out.println(hs);
}
}
