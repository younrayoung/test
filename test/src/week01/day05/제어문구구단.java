package week01.day05;

public class 제어문구구단 {

	public static void main(String[] args) {
		
		
		// 구구단을 반복문으로 해결
		// 2~9단 출력
		// 하나 단 =>9개 출력
		
		for(int i=2; i<=9; i++) {
			System.out.println("====");
			System.out.println(i+"단");
			System.out.println("====");
			// 단 출력
			for(int j=1; j<=9; j++) {
				System.out.println(i*j);
			}
		}
		
		System.out.println("2~4eks 출력하기 ver1");
		//2단
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		//3단
		System.out.println(3*1);
		System.out.println(3*2);
		System.out.println(3*3);
		System.out.println(3*4);
		System.out.println(3*5);
		System.out.println(3*6);
		System.out.println(3*7);
		System.out.println(3*8);
		System.out.println(3*9);
		
		//4단
		System.out.println(4*1);
		System.out.println(4*2);
		System.out.println(4*3);
		System.out.println(4*4);
		System.out.println(4*5);
		System.out.println(4*6);
		System.out.println(4*7);
		System.out.println(4*8);
		System.out.println(4*9);
		
		
		System.out.println("2~단 출력하기 ver1");
		//2단
		for(int k=2; k<=4; k++) { 
		System.out.println(k*1);
		System.out.println(k*2);
		System.out.println(k*3);
		System.out.println(k*4);
		System.out.println(k*5);
		System.out.println(k*6);
		System.out.println(k*7);
		System.out.println(k*8);
		System.out.println(k*9);
		}
		
		System.out.println("2~4단 출력하기 ver2");
		for(int m=2; m<=4; m++) {
			for(int n=1; n<=9; n++) {
				System.out.println(m*n);
			}
		}
	}

}
