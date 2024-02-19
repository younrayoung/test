package week02.day07.문제풀이;

import java.util.Scanner;

public class a_문제_연습 {

	public static void main(String[] args) {
		
		
		//사고싶은 물건 5개 배열에 저장하고 출력하기
		
		String[] good = new String[5];
		
			good[0] = "초콜렛";
			good[1] = "사탕";
			good[2] = "쿠키";
			good[3] = "젤리";
			good[4] = "빵";
			
		//배열내용 출력
		for(int i=0; i<5; i++) {
			System.out.print(good[i]+" ");
		}
		
		
		
		// 사용자로부터 입력받은 재료
		Scanner sc = new Scanner(System.in);
		
	/*
		good[0] = sc.next();
		good[1] = sc.next();
		good[2] = sc.next();
		good[3] = sc.next();
		good[4] = sc.next();
	*/
		
		for(int i=0; i<5; i++) {
			good[i]= sc.next();
		}
		
		
		// 배열내용 출력
		for(int i=0; i<5; i++) {
			System.out.print(good[i]+" ");
		}
	}

}
