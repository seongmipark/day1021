//심사위원점수 집계 0~10.0
//10명의 점수중에서 최저 점수,최고점수제외

package com.sist.exam06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Programming07 {

	public static void main(String[] args) {
	ArrayList<Double> list = new ArrayList<Double>();
	
	Scanner sc = new Scanner(System.in);
	double score;	
	
	for(int i=0 ;i<10;i++) {
	System.out.print("심사위원 "+(i+1)+"의 점수를 입력하시오(0~10.0사이)==>");
	score = sc.nextDouble();
	list.add(score);
	}
	
	double max = list.get(0);
	double min = list.get(0);

	//최고
	for (int i=0 ; i<list.size() ; i++ ){ 
		if(list.get(i) > max){
			max = list.get(i);
			
		}
	}
	System.out.println("최고점수는"+max);
	
	//최저
	for (int i=0 ; i<list.size() ; i++ ){ 
			if(list.get(i) < min){
				min = list.get(i);
		}	
	}
	
	
	System.out.println("최저점수는"+min);
	
	list.remove(max);
	list.remove(min);
	
	double sum=0;
	for(int i = 0 ; i<list.size() ; i++ ) {
		sum = sum + list.get(i);
	}
	
	System.out.println(list);
	System.out.println(sum);
	}
}
	
