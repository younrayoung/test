package week01.문제풀이과제;

import java.util.Scanner;

public class 문제13 {

	public static void main(String[] args) {
		// 주문수량, 메뉴를 입력받아 해당 주문의 주문금액을 출력하는 프로그램 작성, 메뉴 가격 임의 지정

		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("메뉴를 입력하세요.");
		
		String name;
		name=sc.next();
		int pay=0;
		
		System.out.println("수량을 입력하세요.");
		int n= sc.nextInt();
		
		switch(name) {
		case "아메리카노" : 
			pay=4000;
			break;
		case "카페라떼" : 
			pay=5000;
			break;
		case "바닐라라떼" : 
			pay=5500;
			break;
		case "레몬에이드" : 
			pay=6000;
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			System.exit(0);
		}
		System.out.println(name+"의 가격은 "+ (pay*n) +" 입니다.");
	}
}
