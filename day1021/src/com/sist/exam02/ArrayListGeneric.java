package com.sist.exam02;

import java.util.Date;
import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("홍길동");
		list.add(26.7);
		list.add(new Date());
		list.add(true);
		System.out.println(list);

		ArrayList<String> list2 = new ArrayList<String>();
		//list2.add(100); 
		//제네릭을 하여 String만 담을수 해서 int를 담을 수 없음
		list2.add("홍길동");
		list2.add("유관순");
		list2.add("이순신");
		System.out.println(list2);	
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add(100+""); //String을 변환
		list3.add("홍길동");
		list3.add(26.7+"");
		list3.add(new Date()+"");
		list3.add(true+"");
		System.out.println(list3);	
		
		//ArrayList<int> list4 = new ArrayList<String>();
		//자료형을 정수형을 제한하기 위해 int을 사용할수 없고
		//기본자료형 int를 객체로 만들어주는 Integer클래스를 사용해야한다.
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(50);
		list4.add(60);
		list4.add(70);
		list4.add(80);
		//list4.add(85.7); int가 아니라서 담을 수 없다.
		System.out.println(list4);	
	}		

}
