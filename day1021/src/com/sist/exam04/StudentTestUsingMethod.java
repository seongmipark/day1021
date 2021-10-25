package com.sist.exam04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestUsingMethod {
	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.print("1.�߰�, 2.�˻�, 3.����, 4.������, 5.��λ���, 0.����\\n");
		System.out.print("�޴��� �����ϼ���-->");
	}
	
	public static void insertStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.print("�л��� �̸��� �Է��Ͻÿ�==>");
		name = sc.next();
		System.out.print("�л��� �ּҸ� �Է��Ͻÿ�==>");
		addr = sc.next();
		System.out.print("�л��� ��ȭ��ȣ�� �Է��Ͻÿ�==>");
		phone = sc.next();
		list.add(new Student(name,addr,phone));
	}
	
	public static void searchStudent(ArrayList<Student> list) {
		System.out.println("�˻��� �л��� �̸��� �Է��Ͻÿ�==>");
		String name = sc.next();
		
		Student searchStudent = null;
		for(int i=0;i<list.size() ; i++) {
			if(list.get(i).getName().equals(name)) {
				searchStudent = list.get(i);
				break;
			}
		}
		
		if(searchStudent != null) {
			System.out.println(searchStudent);
		}else {
			System.out.println("ã���� �ϴ� �л� "+name+"�� �����ϴ�");
		}
	}
	
	public static void deleteStudent(ArrayList<Student> list) {
		System.out.println("������ �л��� �̸��� �Է��Ͻÿ�==>");
		String name = sc.next();
		int i;
		int cnt = list.size();
		//����Ʈ�� �����ϸ� ����Ʈ�� ũ�Ⱑ ����Ǳ� ������ �����ϱ� ���� ����Ʈ ũ�⸦ �̸� ������ ����
		
		for(i=0;i<list.size() ; i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				break;
			}
		}
		if( i < cnt ) {
			System.out.println(name+"�л��� �����͸� �����Ͽ����ϴ�.");
		}else {
			System.out.println("���� �Ϸ��� �л� "+name+"�� �����ϴ�");
		}
	}
		
	public static void printAll(ArrayList<Student> list) {
		if(list.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}else {
			for(Student student : list ) {
				System.out.println(student);
			}
		}	
	}	
	
	public static void deleteAll(ArrayList<Student> list) {
		list.clear(); //
		System.out.println("�����͸� ��� �����߽��ϴ�.");
			}	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		

		while(true) {
			printMenu();
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
		
		switch(menu){
		case 1: insertStudent(list);break;
		case 2: searchStudent(list);break;
		case 3: deleteStudent(list);break;
		case 4: printAll(list);break;
		case 5:	deleteAll(list);break;
		
		//main�޼ҵ� �ȿ� ��� ������ ��ó���� ����ְ� �Ǹ�
		//������(readability)�� ��������.
		//�޼ҵ带 ���� �ξ� ���� �޼ҵ忡�� �ش� �޼ҵ带 �ҷ����� 
		//������(readability)�� ���� �� �ִ�.
		
			}
		}
	}
}
	

