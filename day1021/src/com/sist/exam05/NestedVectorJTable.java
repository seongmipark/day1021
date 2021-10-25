package com.sist.exam05;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class NestedVectorJTable {

	public static void main(String[] args) {
		Vector<Vector<String>> list = new Vector<Vector<String>>();
		
		Vector<String> row1 = new Vector<String>();
		row1.add("ȫ�浿");
		row1.add("����");
		row1.add("010-1234-1111");
		
		Vector<String> row2 = new Vector<String>();
		row2.add("������");
		row2.add("��õ");
		row2.add("010-1234-2222");
	
		Vector<String> row3 = new Vector<String>();
		row3.add("������");
		row3.add("����");
		row3.add("010-1234-3333");
		
		
		list.add(row1);
		list.add(row2);
		list.add(row3);
		
		Vector<String> colNames = new Vector<String>();
		colNames.add("�̸�");
		colNames.add("�ּ�");
		colNames.add("��ȭ");
		
		
		JTable table = new JTable(list, colNames);
		JScrollPane jsp = new JScrollPane(table);
		//table�� ������ Scrollpane�� ���� jsp�� ��Ƽ� �����ӿ� �־��.
		
		JFrame frame = new JFrame();
		frame.add(jsp);
		frame.setSize(400,500);
		frame.setVisible(true);	
	}

}

