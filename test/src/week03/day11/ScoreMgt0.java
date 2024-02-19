package week03.day11;

import java.util.Scanner;

public class ScoreMgt0 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {
			
			System.out.println("메뉴를 선택하시오  1.등록  2.조회  3.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("없는 메뉴"); // break;주지 않는 이유는 아래로 흐를게 없어서
				System.exit(0); // 프로그램 종료
				
			}
		}

	}

}
