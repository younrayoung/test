package week02.day09.연습문제;

import java.util.Scanner;

public class a_일정관리프로그램_2 {

	public static void main(String[] args) {
		// 5개 일정을 관리하는 프로그램 작성  (main에서 작성하기 ) 
		// 등록, 조회, 변경, 삭제 ( 삭제시 내용에 0을 넣는 것으로 한다.)

		
		String [] arr = new String[5];
		int index=0;
		
		Scanner sc = new Scanner(System.in);
		
		
	loop:while(true) {
			System.out.println("메뉴를 선택하세요 => 1.등록  2.조회  3.변경  4.삭제  5.종료");
			String menu = sc.nextLine();
			
			switch(menu) {
			
			case "1": 
				System.out.println("등록할 이름을 입력하세요");
				String name = sc.nextLine();
				arr[index]= name;
				index++;
				
				
				break;
			
			case "2":
				System.out.println("조회합니다");
				for(int i=0; i<index; i++) {
					if( arr[i].equals("0")) {
					}else {
						System.out.println((i+1) + arr[i]);
					}
				}
				break;
				
			case "3":
				System.out.println("변경합니다");
				// 조회하고
				// 변경할 번호 입력
				// 변경할 이름 
				for(int i=0; i<index; i++) {
					if(arr[i].equals("0")) {
						System.out.println((i+1) + arr[i]);
					}
				}
				break;
				
			case "4":
				System.out.println("삭제합니다");
				break;
				
			case "5":
				System.out.println("종료합니다");
				break loop;
				
			default :
				System.out.println(" 잘못된 메뉴");
				System.exit(0);	
				
				
				
				
			}
		}
		
		
	}

}
