/*
 * ����� ���� ������ �Է¹޾� �ܾ �󵵼��� ���Ͽ� ����� ���ϴ�.
	<< ���� �� >>
	������ �Է��ϼ���==> hello korea hello java
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
		
		System.out.print("������ �Է��ϼ���.==>");
		data = sc.nextLine();
		

		//hello korea hello java
		//�ܾ�� �ڸ���, �迭�����...
		//�ߺ����� ���� ī��Ʈ�Ѵ�..
		//����Ҷ� ���ڿ� �ߺ����� �ѹ���
		
		String []arr = data.split(" "); //�и��ϱ� 
		
		
		ArrayList<String> list = new ArrayList();		

		int cnt=0;
		for(int i = 0 ; i < arr.length ; i++) {
			list.add(arr[i]);
		}
		
		//arraylist������ �ߺ����� Ȯ��..
		
		
		
		/*HashMap<String, Integer> str_count = new HashMap<String, Integer>();
        
		for(int i = 0 ; i < list.size() ; i++){ // ArrayList ��ŭ �ݺ�
		    if (str_count.containsKey(list.get(i))) { // HashMap ���ο� �̹� key ���� �����ϴ��� Ȯ��
		    	str_count.put(list.get(i), str_count.get(list.get(i))  + 1);  // key�� �̹� �ִٸ� value�� +1
		    } else { // key���� �������� ������
		    	str_count.put(list.get(i) , 1); // key ���� ������ value�� 1�� �ʱ�ȭ
		    }
		}
		System.out.println(str_count);*/
	
	
	}
}


		
	



