/*
 * 사용자 한테 문장을 입력받아 단어별 빈도수를 구하여 출력해 봅니다.
	<< 실행 예 >>
	문장을 입력하세요==> hello korea hello java
	hello	2
	korea	1
	java	1
 */

package com.sist.exam06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data;
		
		System.out.print("문장을 입력하세요.==>");
		data = sc.nextLine();
		

		//hello korea hello java
		//단어별로 자르고, 배열에담고...
		//중복값을 세서 카운트한다..
		//출력할때 문자열 중복값은 한번만
		
		String []arr = data.split(" "); //분리하기 
		
		
		ArrayList<String> list = new ArrayList();		

		int cnt=0;
		for(int i = 0 ; i < arr.length ; i++) {
			list.add(arr[i]);
		}
		
		//arraylist내에서 중복값을 확인..
		
		
		
		/*HashMap<String, Integer> str_count = new HashMap<String, Integer>();
        
		for(int i = 0 ; i < list.size() ; i++){ // ArrayList 만큼 반복
		    if (str_count.containsKey(list.get(i))) { // HashMap 내부에 이미 key 값이 존재하는지 확인
		    	str_count.put(list.get(i), str_count.get(list.get(i))  + 1);  // key가 이미 있다면 value에 +1
		    } else { // key값이 존재하지 않으면
		    	str_count.put(list.get(i) , 1); // key 값을 생성후 value를 1로 초기화
		    }
		}
		System.out.println(str_count);*/
	
	
	}
}


		
	



