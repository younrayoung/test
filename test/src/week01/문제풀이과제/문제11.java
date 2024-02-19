package week01.문제풀이과제;

public class 문제11 {

	public static void main(String[] args) {
		// 3단 구구단 출력, 원하는 단 출력, 전체 구구단 출력
		
		for(int i=1; i<=9; i++) {
			System.out.println("3 * "+i+" = "+3*i);
		}

		//4~6단 출력
		
		for(int i=4; i<=6; i++) {
			System.out.println("===");
			System.out.println(i+"단");
			System.out.println("===");
			for(int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}

}
