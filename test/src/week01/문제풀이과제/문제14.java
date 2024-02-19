package week01.문제풀이과제;

import java.util.Scanner;

public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true) {
			
		
			System.out.println("메뉴를 입력하세요.");
			
			String name;
			name=sc.next();
			int pay=0;
			if(name.equals("0")) {
				System.out.println("종료");
				break;
			}
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
			System.out.println(name+"의 가격은 "+pay+" 입니다.");
		}
	  }
	}