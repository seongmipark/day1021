//Set을 이용하여 5개의 로또번호를 생성해보자

package com.sist.exam02;

import java.util.Random;
import java.util.TreeSet;

public class AutoLottoUsingSet {

	public static void main(String[] args) {
		
		for(int i =0;i<5;i++){ //5장만들기
		TreeSet set = new TreeSet();
		Random r = new Random();
		while(set.size() < 6) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		 }
	}

}
