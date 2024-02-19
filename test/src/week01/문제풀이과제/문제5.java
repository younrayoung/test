package week01.문제풀이과제;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// 일정을 관리프로그램 만들기(1번)
		// 1.등록  2.조회  3.변경  4.삭제 //실제 등록되거나 조회되지 않습니다. 메세지만 출력합니다.
		
		
		Scanner sc = new Scanner(System.in);
		int menu=0; // 1.등록  2.조회  3.변경  4.삭제  5.종료
		
		System.out.println("메뉴를 숫자로 입력하세요.");
		System.out.println("1.등록  2.조회  3.변경  4.삭제 ");
		
		//menu=2;
		menu = sc.nextInt();

		switch(menu) {
			case 1:
				System.out.println(" 등록합니다.");
				break;
			case 2:
				System.out.println(" 조회합니다.");
				break;
			case 3:
				System.out.println(" 변경합니다.");
				break;
			case 4:
				System.out.println(" 삭제합니다.");
				break;
			default:
				System.out.println(" 메뉴 선택이 잘못되었습니다.");
				
		}

	}
   
}
