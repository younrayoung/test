package week02.day09.연습문제;

import java.util.Scanner;

public class b_조회하기 {

	public static void main(String[] args) {
		// 등록하기
		
		
		Scanner sc = new Scanner(System.in);
		
		String [] arr = new String[5];
		int index = 0;
		
		
		System.out.println("메뉴를 입력하세요 => 1.등록  2.조회");
		String menu = sc.nextLine();
		
		System.out.println("등록할 이름을 입력하세요");
		String name = sc.nextLine();
		arr[index] = name;
		index++;
		
		
		System.out.println("조회하기");
		for(int i=0; i<index; i++) {
				System.out.println((i+1) + arr[i]);
			
		}
	
	}

}
