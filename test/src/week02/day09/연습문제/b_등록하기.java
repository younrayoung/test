package week02.day09.연습문제;

import java.util.Scanner;

public class b_등록하기 {

	public static void main(String[] args) {
		// 등록하기
		
		
		Scanner sc = new Scanner (System.in);
		
		String[] arr = new String[5];
		int index=0;
		
		System.out.println("메뉴를 입력하세요 => 1.등록");
		String menu = sc.nextLine();
		
		System.out.println("등록할 이름을 입력하세요");
		String name = sc.nextLine();
		arr[index] = name;
		index++;

	}

}
