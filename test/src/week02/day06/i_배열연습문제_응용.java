package week02.day06;

import java.util.Scanner;

public class i_배열연습문제_응용 {

	public static void main(String[] args) {
		// 

		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력할 숫자의 개수를 입력하세요: ");
		int num=sc.nextInt();
		
		int[] numbers2=new int[num];
		
		System.out.println(num + "개의 정수를 입력하세요:");
		for(int i=0; i<num; i++) {
			 numbers2[i] = sc.nextInt();
		}
		
		System.out.print("짝수만 출력 => ");
        for (int i = 0; i < num;  i++) {
            if (numbers2[i] % 2 == 0) {
                System.out.print(numbers2[i] + " ");
            }
        }
		
	}

}
