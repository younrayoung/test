package week02.day09.연습문제;

import java.util.Scanner;

public class a_일정관리프로그램_0 {

	public static void main(String[] args) {
		// 5개 일정을 관리하는 프로그램 작성  (main에서 작성하기 ) 
		// 등록, 조회
		
		Scanner sc = new Scanner (System.in);
		
		String [] arr = new String[5];
		int index=0;
		
		while(true) {
			System.out.println("메뉴를 선택하세요. => 1.등록  2.조회  3.변경  4.삭제  5.종료");
			String menu = sc.nextLine();
			switch(menu) {
			
			case "1":
				System.out.println("등록할 이름을 입력하세요.");
				String name = sc.nextLine();
				arr[index]=name;
				index++;
				break;
			case "2":
				System.out.println("조회합니다.");
				for(int i=0; i<index; i++) {
					if(!arr[i].equals("0")) {
						System.out.println("arr[index]");
					}
				}
				break;
			case "3":
				System.out.println("등록합니다.");
				break;
			case "4":
				System.out.println("등록합니다.");
				break;
			case "5":
				System.out.println("등록합니다.");
				break;
				
			
			
			
			}
		}
		
	}

}
