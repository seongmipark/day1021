package com.sist.exam02;

import java.util.Date;
import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("ȫ�浿");
		list.add(26.7);
		list.add(new Date());
		list.add(true);
		System.out.println(list);

		ArrayList<String> list2 = new ArrayList<String>();
		//list2.add(100); 
		//���׸��� �Ͽ� String�� ������ �ؼ� int�� ���� �� ����
		list2.add("ȫ�浿");
		list2.add("������");
		list2.add("�̼���");
		System.out.println(list2);	
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add(100+""); //String�� ��ȯ
		list3.add("ȫ�浿");
		list3.add(26.7+"");
		list3.add(new Date()+"");
		list3.add(true+"");
		System.out.println(list3);	
		
		//ArrayList<int> list4 = new ArrayList<String>();
		//�ڷ����� �������� �����ϱ� ���� int�� ����Ҽ� ����
		//�⺻�ڷ��� int�� ��ü�� ������ִ� IntegerŬ������ ����ؾ��Ѵ�.
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(50);
		list4.add(60);
		list4.add(70);
		list4.add(80);
		//list4.add(85.7); int�� �ƴ϶� ���� �� ����.
		System.out.println(list4);	
	}		

}
