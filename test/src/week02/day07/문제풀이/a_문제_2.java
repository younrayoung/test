package week02.day07.문제풀이;

import java.util.Scanner;

public class a_문제_2 {

	public static void main(String[] args) {
		
		// 1. 반복 
		//    수를 입력받는다.
		//    총점을 구한다.
		// 2. 평균을 구한다.
		// 3. 평균을 출력
		
		// 성적을 5개 입력받아서 평균을 구하기, 배열X
		Scanner sc = new Scanner(System.in);
		System.out.println("성적점수 5개를 입력하시오.");
		int input;
		int sum=0;
		double avg;
		
		for(int i=1; i<=5; i++) {
			input = sc.nextInt();
			sum=sum+input;
		}
		avg = sum / 5.0; // 실수연산 => 소수아래테이터 발생
		System.out.println("평균값은 "+avg+"입니다.");
		System.out.println("================");
		
		
		// 성적을 5개 입력받아서 평균을 구하기, 배열O
		// 모든 학생의 성적을 함께 출력하시오.
		
		int[] scores = new int[5];
		int total=0;
		double avg_scores;
		
		for(int i=0; i<5; i++) {
			scores[i] = sc.nextInt();
			total = total + scores[i];
		}
	/*
		// 첫번쨰 학생성적
		scores[0] = sc.nextInt();
		total = total + scores[0];
		// 두번째
		scores[1] = sc.nextInt();
		total = total + scores[1];
		// 세번째
		scores[2] = sc.nextInt();
		total = total + scores[2];
		// 네번째
		scores[3] = sc.nextInt();
		total = total + scores[3];
		//다섯번째
		scores[4] = sc.nextInt();
		total = total + scores[4];
	*/	
		
		// 평균 구하기
		avg_scores = total / 5.0;
		System.out.println("평균값은 "+avg+"입니다.");

	}

}
