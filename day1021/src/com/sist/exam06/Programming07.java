//�ɻ��������� ���� 0~10.0
//10���� �����߿��� ���� ����,�ְ���������

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
	System.out.print("�ɻ����� "+(i+1)+"�� ������ �Է��Ͻÿ�(0~10.0����)==>");
	score = sc.nextDouble();
	list.add(score);
	}
	
	double max = list.get(0);
	double min = list.get(0);

	//�ְ�
	for (int i=0 ; i<list.size() ; i++ ){ 
		if(list.get(i) > max){
			max = list.get(i);
			
		}
	}
	System.out.println("�ְ�������"+max);
	
	//����
	for (int i=0 ; i<list.size() ; i++ ){ 
			if(list.get(i) < min){
				min = list.get(i);
		}	
	}
	
	
	System.out.println("����������"+min);
	
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
	
