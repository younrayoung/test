package week01.문제풀이과제;

import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		// 수를 입력받아서 짝수의 합을 구하세요.( 10개의 수를 입력)
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("10개의 숫자를 띄어쓰기로 작성하세요");
	 
	 
		int sum=0;
		for(int i=0; i<10; i++) {
			int n=sc.nextInt();
			if(n%2==0) {
				sum=sum+n;
			}
		}
		System.out.println("짝수 합 : "+sum);
	}

}
