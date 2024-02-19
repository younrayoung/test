package week02.day08.연습문제;

import java.util.Scanner;

public class 문제_1 {

	public static void main(String[] args) {
		
		int[] n = {8,2,11,4,5};

			
			
		int result  =짝수개수구하기(n);
		System.out.println("짝수의 개수는 "+result+"개");
	
	}


	
	
//------------------------------------------
	
	public static int 짝수개수구하기(int[]sum) {
		
		int index=0;
		for (int i = 0; i < sum.length; i++) {
            if ( sum[i] % 2 == 0) {             
                index++;
            }
		}
		
		return index;
	 
	}
	
}
