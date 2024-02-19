package week01.day05;

public class 제어문반복문3 {

	public static void main(String[] args) {


		// 중첩반복
		// 별 하나를 이용해서 별찍기
		/*
		 *  *****
		 *  *****
		 *  *****
		 * 
		 */

		for(int i=1; i<=5; i++) {
			System.out.println("*");
		}
		System.out.println("====");
		
		for(int j=1; j<=3; j++) {			// j=1		i=5(반복)
			// 반복해야 할 일					// j=2		i=5(반복)
			for(int i=1; i<=5; i++) {  		// j=3		i=5(반복)
				System.out.println("*");
			}
		}
		System.out.println("====");
		
		for(int k=1; k<=3; k++) {
			System.out.println("안녕");
		}
	}

}
