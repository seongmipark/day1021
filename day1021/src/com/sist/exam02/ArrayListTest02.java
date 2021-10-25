package com.sist.exam02;

import java.util.ArrayList;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println(name+"님 안녕하세요.");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class ArrayListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add(true); // boolean형 
		list.add(new Person("홍길동",20)); //객체
		list.add(new Person("이순신",40));
		list.add(26.7); //double형
		list.add(new Person("유관순",30));
		list.add("안녕하세요"); //String형
		list.add(2021);//정수형
		//=>어떤 자료형이든 담을 수 있다.
		
		//list에 데이터가 있는 만큼 반복실행하면서 데이터를 
		//하나씩 꺼집어내 sayHello메소드 호출하기
		for(int i=0  ; i<list.size()  ; i++ ) {
			Object obj = list.get(i);
			//get메소드는 어떤 형이든 담을 수 있는 object 자료형을 갖고있다
			System.out.println(obj);
			
			if(obj instanceof Person) {
			((Person)obj).sayHello();
			//다른 자료형들이 담겨져있어 person객체인지 물어본 후 실행해야 오류X
			}
			//Person p = (Person)list.get(i);
			//get메소드는 오브젝트자료형을 갖고있어 에러 이렇게쓸거면 형변환 시켜준다.
			//p.sayHello();
			
		}
	}
}
