//Set�� �̿��Ͽ� 5���� �ζǹ�ȣ�� �����غ���

package com.sist.exam02;

import java.util.Random;
import java.util.TreeSet;

public class AutoLottoUsingSet {

	public static void main(String[] args) {
		
		for(int i =0;i<5;i++){ //5�常���
		TreeSet set = new TreeSet();
		Random r = new Random();
		while(set.size() < 6) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		 }
	}

}
