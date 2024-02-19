package week02.day08.연습문제;

import java.util.Scanner;

public class 문제4_2 {

	public static void main(String[] args) {
		// 오늘 점심메뉴 추천해주는 함수 만들기

		
				
		Scanner sc = new Scanner(System.in);
		int menu=0;
				
		while(menu !=5) {
				
		System.out.println("메뉴 추천받기! 1~5 중에서 숫자를 입력하세요.");
				
		menu = sc.nextInt();
		switch(menu) {
			case 1:
				System.out.println(" 짜장면");
				break;
			case 2:
				System.out.println(" 김밥");
				break;
			case 3:
				System.out.println(" 라면");
				break;
			case 4:
				System.out.println(" 국밥");
				break;
			case 5:
				System.out.println(" 파스타");
				break;
						
			default:
				System.out.println(" 메뉴 선택이 잘못되었습니다.");
						
			}

		}
	}
}
	
	
	
	


