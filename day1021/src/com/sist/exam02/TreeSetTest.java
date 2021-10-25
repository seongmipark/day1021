package com.sist.exam02;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add("사과");
		set.add("수박");
		set.add("딸기");
		System.out.println(set);//[딸기, 사과, 수박]
		System.out.println(set.size()); //3
		set.add("바나나");
		set.add("사과");
		set.add("귤");
		set.add("감");
		System.out.println(set); // [감, 귤, 딸기, 바나나, 사과, 수박]
		System.out.println(set.size()); //6
		
		set.remove("딸기");
		System.out.println(set); //[감, 귤, 바나나, 사과, 수박]
		System.out.println(set.size()); //5
	}
}
