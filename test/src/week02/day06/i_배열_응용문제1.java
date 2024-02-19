package week02.day06;

import java.util.Scanner;

public class i_배열_응용문제1 {

	public static void main(String[] args) {


	// 수가 입력될때 짝수만 배열에 담기
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("숫자를 입력하세요: ");
	        int n = scanner.nextInt();

	        // 입력된 수의 최대 크기로 배열 생성
	        int[] numbers = new int[n];
	        int index = 0;

	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                numbers[index] = i;
	                index++;
	            }
	        }

	        // 결과 출력
	        System.out.print("짝수 배열: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(numbers[i] + " ");
	        }

	        scanner.close();
	    }

	}


