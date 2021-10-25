package com.sist.exam06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sist.exam04.Student;


public class Programming11 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
			System.out.print("1.추가, 2.검색, 3.삭제, 4.단어목록, 0.종료\n");
			System.out.print("메뉴를 선택하세요==>");	
	}

	public static void insertword(HashMap<String, String> map) {
		System.out.print("단어를 입력하세요==>");
		String word = sc.next();
		System.out.print("뜻을 입력하세요==>");
		String mean = sc.next();
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		map.put(word,mean);
	}
	
	public static void searchword(HashMap<String, String> map) {
		System.out.print("검색할 영단어를 입력하시오==>");
		String word = sc.next();
		
		if(map.containsKey(word)){ 
			System.out.println(word +":"+ map.get(word));
		}else
			System.out.println(word + "는 없는 단어 입니다.");	
	}
	
	public static void deleteword(HashMap<String, String> map) {
		System.out.println("삭제할 영단어를 입력하시오==>");
		String word = sc.next();
		
		if(map.containsKey(word)){ 
			map.remove(word);
		}else {
			System.out.println(word + "는 없는 단어 입니다.");	
		}	
	}
		
	public static void printAll(HashMap<String, String> map) {
		if(map.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		}else {
			  for( String key : map.keySet() ){
		            System.out.println( String.format(" %s : %s", key, map.get(key)) );
		        }
			}
		}	
	
	
	public static void main(String[] args) {
		
		HashMap<String, String> dir = new HashMap<String, String>();
		dir.put("apple","사과");
		dir.put("book","책");
		dir.put("dog","개");

		
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