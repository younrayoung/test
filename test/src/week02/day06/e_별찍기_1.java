package week02.day06;

public class e_별찍기_1 {

	public static void main(String[] args) {
		
		
		System.out.println("*");
		
		System.out.println("별 5개 출력하기");
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		
		
		System.out.println();// 줄 바꾸기
		
		System.out.println("별 5개 출력하기 -반복문");
		
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("별 5개 출력하기 -반복문 whlie");
		
		int j=1;
		while(j<=5) {
			System.out.print("*");
			j=j+1;
		}
	}

}
