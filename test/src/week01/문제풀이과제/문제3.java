package week01.문제풀이과제;

import java.util.Scanner;

public class 문제3 {
	public static void main(String[] args) {
		// 사용자로부터 수를 입력받아 입력받은 수까지의 합 구하기
		
		
		//3개의 수를 입력받아 입력받은 수의 합을 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 숫자를 띄어쓰기로 구분하여 입력하세요.");
			 int n1= sc.nextInt();
			 int n2= sc.nextInt();
			 int n3= sc.nextInt();
	
			int sum= n1 + n2 + n3 ;
			
		System.out.println("입력한 3개의 수의 합 :" + sum);

		
		// 입력받은 수까지의 합
		int n=sc.nextInt();
		int sum2=0;
		for(int i=1; i<=n; i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2);	
		
	}
	
	

}
