package week01.문제풀이과제;

public class 문제10응용 {

	public static void main(String[] args) {
	
		// 한줄씩 별 1개 늘어나서 5개 5줄 만들기
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++) { // j<i+1 ====> for문은 초기화됨
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// 반대로 만들기
			for(int n=1; n<=5; n++) {
				for(int k =1; k<=6-n; k++) { 
					System.out.print("*");
				}
				System.out.println();
			}
			
			
	}

}

