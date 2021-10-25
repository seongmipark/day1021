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
		System.out.println(name+"�� �ȳ��ϼ���.");
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
		list.add(true); // boolean�� 
		list.add(new Person("ȫ�浿",20)); //��ü
		list.add(new Person("�̼���",40));
		list.add(26.7); //double��
		list.add(new Person("������",30));
		list.add("�ȳ��ϼ���"); //String��
		list.add(2021);//������
		//=>� �ڷ����̵� ���� �� �ִ�.
		
		//list�� �����Ͱ� �ִ� ��ŭ �ݺ������ϸ鼭 �����͸� 
		//�ϳ��� ����� sayHello�޼ҵ� ȣ���ϱ�
		for(int i=0  ; i<list.size()  ; i++ ) {
			Object obj = list.get(i);
			//get�޼ҵ�� � ���̵� ���� �� �ִ� object �ڷ����� �����ִ�
			System.out.println(obj);
			
			if(obj instanceof Person) {
			((Person)obj).sayHello();
			//�ٸ� �ڷ������� ������־� person��ü���� ��� �� �����ؾ� ����X
			}
			//Person p = (Person)list.get(i);
			//get�޼ҵ�� ������Ʈ�ڷ����� �����־� ���� �̷��Ծ��Ÿ� ����ȯ �����ش�.
			//p.sayHello();
			
		}
	}
}
