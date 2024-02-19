package week01.문제풀이과제;

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		// 사용자가 입력한 수에 대한 약수를 입력하시오.
		//예시 : 6의 약수 -> 1,2,3,6
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++ ) {
			if(n%i==0) {
				System.out.print(i+",");
			}
		}
	}

}
