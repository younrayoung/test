package week01.문제풀이과제;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// 고객정보(아이디, 이름, 나이, 키) 입력받아서 출력하기

		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
			String id = sc. nextLine();
			
		System.out.println("이름을 입력하세요.");
			String name = sc. nextLine();
			
		System.out.println("나이를 입력하세요.");
			String age = sc. nextLine();
			
		System.out.println("키를 입력하세요.");
			String hei = sc. nextLine();
			
			System.out.println("아이디 : " + id);
			System.out.println("이름 : "+ name);
			System.out.println("나이 : "+ age);
			System.out.println("키 : "+ hei);
		
		
	}

}
