package com.sist.exam02;

import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListScoreTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		
		for(int i = 0 ;i < 5;i++) {
			int temp;
			System.out.printf("%d번째 학생의 점수를 입력하세요==>\n",i+1);
			list.add(sc.nextInt());
			tot = tot + list.get(i);
			}
		
		double avg = (double)tot / list.size();
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.printf("%d번 학생의 점수==>%d/n",i+1,list.get(i));
		}
		System.out.println();
		System.out.println("총점:"+tot);
		System.out.printf("평균:%.1f",avg);
	}

}
