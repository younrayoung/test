package week03.day11;

import java.util.Random;

public class a_Static매서드_nonStatic매서드 {

	public static void main(String[] args) {
		
		// 두 수중에 큰값 구하기
		
		int su1=10;
		int su2=20;
		
		int result = Math.max(su1, su2 );
		System.out.println(result);
		
		
		double result2 = Math.random();
		System.out.println(result2);
		
		
		// non-Static 매서드를 사용하고 싶을때 
	/*
	 	1. 객체를 생성하느 코드 작성
	 	2.
	*/
		Random r = new Random(); // 1번    r이 객체
		int result3=r.nextInt();
		System.out.println(result3);
		
	}

}
