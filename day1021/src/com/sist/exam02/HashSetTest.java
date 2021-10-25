package com.sist.exam02;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet data = new HashSet();
		data.add("사과");
		data.add("포도");
		data.add("수박");
		data.add("귤");
		System.out.println(data);
		data.add("오렌지");
		data.add("사과"); // 중복 데이터는 제외시킨다.
		System.out.println(data);
		//데이터의 순서상관없이 중복값 제외하고 출력된다.
	}

}
