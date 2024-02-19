package week03.day11;

import java.util.Scanner;

public class ScoreMgt1 {

	public static void main(String[] args) {
		
		//준비단계
		Score[] scores = new Score[5];
		int index = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {
			
			System.out.println("메뉴를 선택하시오  1.등록  2.조회  3.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("등록");
				System.out.println("학생정보입력 : 예시) 홍길동 90(국어) 100(영어)");
				String name = sc.next();
				int kor= sc.nextInt();
				int eng= sc.nextInt();
				Score s = new Score(name, kor, eng);
				scores[index]=s;
				index++;
				break;
			case 2:
				System.out.println("조회");
				
				for(int i=0; i<index; i++) {
					scores[i].printInfo();
				}
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
