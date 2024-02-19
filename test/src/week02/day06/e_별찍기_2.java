package week02.day06;

public class e_별찍기_2 {

	public static void main(String[] args) {
		
		// ***** 첫번째 줄
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();

		
		// ***** 두번째 줄
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		// ***** 세번째 줄
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		// ***** 네번쨰 줄
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		// ***** 다섯번째 줄
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("=========");
		
		
		//
		System.out.println("중첩반복으로 해결하기");
		
		for(int j=1; j<=3; j++) {
			for(int i=1; i<=3; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
