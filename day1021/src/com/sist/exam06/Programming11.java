package com.sist.exam06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sist.exam04.Student;


public class Programming11 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
			System.out.print("1.�߰�, 2.�˻�, 3.����, 4.�ܾ���, 0.����\n");
			System.out.print("�޴��� �����ϼ���==>");	
	}

	public static void insertword(HashMap<String, String> map) {
		System.out.print("�ܾ �Է��ϼ���==>");
		String word = sc.next();
		System.out.print("���� �Է��ϼ���==>");
		String mean = sc.next();
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		map.put(word,mean);
	}
	
	public static void searchword(HashMap<String, String> map) {
		System.out.print("�˻��� ���ܾ �Է��Ͻÿ�==>");
		String word = sc.next();
		
		if(map.containsKey(word)){ 
			System.out.println(word +":"+ map.get(word));
		}else
			System.out.println(word + "�� ���� �ܾ� �Դϴ�.");	
	}
	
	public static void deleteword(HashMap<String, String> map) {
		System.out.println("������ ���ܾ �Է��Ͻÿ�==>");
		String word = sc.next();
		
		if(map.containsKey(word)){ 
			map.remove(word);
		}else {
			System.out.println(word + "�� ���� �ܾ� �Դϴ�.");	
		}	
	}
		
	public static void printAll(HashMap<String, String> map) {
		if(map.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}else {
			  for( String key : map.keySet() ){
		            System.out.println( String.format(" %s : %s", key, map.get(key)) );
		        }
			}
		}	
	
	
	public static void main(String[] args) {
		
		HashMap<String, String> dir = new HashMap<String, String>();
		dir.put("apple","���");
		dir.put("book","å");
		dir.put("dog","��");

		
		while(true) {
			printMenu();
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			} 
		
		switch(menu){
		case 1: insertword(dir);break;
		case 2: searchword(dir);break;
		case 3: deleteword(dir);break;
		case 4: printAll(dir);break;	
		}

	}

}
}