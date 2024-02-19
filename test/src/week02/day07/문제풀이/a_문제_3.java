package week02.day07.문제풀이;

import java.util.Scanner;

public class a_문제_3 {

	public static void main(String[] args) {
		
		/*
		  	수를 입력받아서 짝수인 경우만 배열에 저장하시오.(10번)
		  	한꺼번에 배열의 내용을 출력하시오.
		  	
		  	
		  변수찾기
		   입력 : 사용자가 입력하는 수 => number
		   출력 : 짝수만 담길 배열 => arr(10)
		   처리 : 반복제어변수 => i
		   
		  처리과정
		   1. 반복 (10)
		      - 수를 입력
		      - 수 짝수인지 판다
		       배열에 수를 저장
		   2. 배열의 내용 출력
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int[] arr = new int[10]; // 배열을 만들면 기본값으로 자동 초기화 해 줌
		
		for(int i=0; i<10; i++) {
			number = sc. nextInt();
			if(number %2==0) {
				arr[i] = number;
			}
		}
		
		
		
		// 배열의 요소 출력하기
		System.out.print("짝수의 배열 출력");
		for(int i=0; i<10; i++) {
			System.out.print(arr[i]+"  ");
		}
		
		
	}

}
