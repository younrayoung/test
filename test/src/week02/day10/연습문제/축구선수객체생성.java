package week02.day10.연습문제;

import java.util.Scanner;

public class 축구선수객체생성 {
	public static void main(String[] args) {
		
	//객체생성
	Player S = new Player("손흥민", 40, 100, 130, 50, 100);
	S.printInfo();//출력
	System.out.println();
	
	Player P = new Player("박지성", 30, 90, 120, 60, 90);
	P.printInfo();
	System.out.println();
	
	Player C = new Player("차두리", 50, 80, 110, 70, 70);
	C.printInfo();
	System.out.println();
	
	Player H = new Player("황희찬", 60, 60, 100, 30, 80);
	H.printInfo();
	System.out.println();
	
	//객체배열
	Player[] arr = new Player[4];
	
	Scanner sc = new Scanner(System.in);

	
	
	}
	
}
