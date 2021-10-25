package com.sist.exam02;

public class ArrayAppend {
	
	public static void printArray(int []data) {
		for(int n :data) {
			System.out.printf("%5d",n);
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		int [] data = {10,20,30,40};
		
		//배열의 맨 뒤에 50을 추가하려면?
		//1.data배열 참조변수가 원래배열의 길이 +1만큼 다시  메모리 확보
		//2.data배열의 요소를 모두 새로 확보한 배열을 이용
		//3.새로확보한 배열의 마지막에 50을 대입
		
		printArray(data);
		
		int []data2 = new int[data.length+1];
		for(int i=0 ;i<data.length  ; i++ ){
			data2[i] = data[i];
		}
		data2[data2.length-1] = 50;
		data = data2;
		printArray(data);
		
		//배열은 데이터 추가,삭제,작업이 빈번한 경우 번거롭기 때문에
		//'컬렉션프레임워크'를 사용합니다.
		
	}

}
