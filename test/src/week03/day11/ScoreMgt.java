package week03.day11;

import java.util.Scanner;

// 학생성적을 관리하는 클래스
public class ScoreMgt {
	
Scanner sc = new Scanner(System.in);
	Score[] list = new Score[10];
	int index = 0;
	
	
	//학생정보 등록하기
	public void register() {
		
		System.out.println("학생정보를 입력하세요");
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		
		Score s = new Score(name, kor, eng);
		list[index]=s;
		index++;
	}

	// 학생정보 출력하기
	public void print() {
		
		for(int i=0; i<index; i++) {
			list[i].printInfo();
		}
	}


	// 메뉴선택 코드
	public void run() {
		
		loop:while(true) {
			System.out.println("메뉴를 선택하세요");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("등록");
				register();
				break;
			case 2:
				System.out.println("조회");
				print();
				break;
			case 3:
				System.out.println("종료");
				break loop;
			
			default : 
				System.out.println("잘못된 메뉴");
				System.exit(0);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		ScoreMgt mgt = new ScoreMgt();
		mgt.run();
		
		
		//객체배열
	/*	
		Score[] Scores = new Score[4];
		Scores[0] = new Score("윤라영", 98, 89);
		Scores[1] = new Score("윤성진", 99, 79);
		Scores[2] = new Score("이건희", 88, 97);
		Scores[3] = new Score("이민재", 78, 87);
		
		System.out.println("갹체배열 이용 - 반복문");
		for(int i=0; i<Scores.length; i++) {
			Scores[i].printInfo();
		}
	*/	
		// 학생을 등록, 조회하는 프로그램을 작성하기
		
	}

}
