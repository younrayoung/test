package week01.day05;

import java.util.Scanner;

public class 제어문스위치2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		//String name="아메리카노";
		String name;
		name = sc.next();
		int price=0;
		
		//메뉴이름에 따른 단가구하기
		
		switch(name) {
		case "아메리카노":
			price=1500;
			break;
		case "카푸치노":
			price=2700;
			break;
		case "아이스 아메리카노":
			price=2000;
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			System.exit(0); // 프로그램 정상종료
		}
		
		System.out.println(name +"는"+ price + "입니다.");
	}

}
