package week01.day04;

import java.util.Scanner;

public class 김기엽_순한맛5 {

	public static void main(String[] args) {
		
		// 수 -> 합계, 평균 출력 		

		//변수선언
		 int Input;
		 int Sum =0; // 초기화 
		 int Avg;
		 int N=0;
		 
		 Scanner sc  = new Scanner( System.in);
		 
		 while( N <5) {
			 Input = sc.nextInt();
			 Sum =Sum+ Input;	
			 N= N+1;
		 }		 
		 Avg= Sum/5;

		 System.out.println( Sum + " " + Avg);
		 
	}

}
