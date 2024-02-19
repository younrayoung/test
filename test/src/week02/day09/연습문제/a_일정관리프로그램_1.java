package week02.day09.연습문제;

import java.util.Scanner;

public class a_일정관리프로그램_1 {

	public static void main(String[] args) {
		// 5개 일정을 관리하는 프로그램 작성  (main에서 작성하기 ) 
		// 등록, 조회
		
		
		String [] arr = new String[5];
		int index=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("메뉴를 선택하세요 => 1.등록  2.조회");
			String menu = sc.nextLine();
			
			switch(menu) {
			
			case "1": 
				System.out.println("등록합니다");
				break;
			
			case "2":
				System.out.println("조회합니다");
				break;
				
				
			}
		}
		
		
	}

}
