package week02.day06;

public class i_배열_기본문제_1 {

	public static void main(String[] args) {
		// 원하는 수 5개를 배열에 담고 배열의 내용을 출력하기

		
		int[] n =new int[5];
		n[0]=1;
		n[1]=2;
		n[2]=3;
		n[3]=4;
		n[4]=5;
		
		// 숫자 출력
		for(int i=0; i<5; i++) {
			System.out.println(n[i]);
		}
		
		System.out.println("=======");
		
		
		//합과 평균
		int sum=0;
		int avg;
			
		for(int j=0; j<5; j++) {
			sum=sum+j;
		}
		avg=sum/5;
		System.out.println
		("숫자의 합은 "+sum+"이고, 숫자의 평균은 "+avg+"입니다.");
		
		System.out.println("=======");
		
		
		// 짝수의 합만 구해서 출력
		
		int sum2=0;
		
		for(int k=0; k<5; k++) {
			if(k%2==0) {
				sum2=sum2+k;
			}
		}
		System.out.println ("짝수 합은 "+sum2+"입니다.");
		
	}
}
