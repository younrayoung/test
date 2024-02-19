package week02.day07.문제풀이;

public class b_배열기본문제_1 {

	public static void main(String[] args) {
		
		
		int[] kors = {90,80,99,89,100};
		
		kors[0]=90;
		kors[1]=80;
		kors[2]=99;
		kors[3]=89;
		kors[4]=100;
		
		// 1. 배열요소 출력하기
		for(int i=0; i<5; i++) {
			System.out.print(kors[i]+" ");
		}
	
		System.out.println("");
		
		
		// 2. 배열전체합 구하기
		int sum=0;
		for(int i = 0; i<5; i++) {
			sum=sum+kors[i];
		}
		System.out.print("배열의 합은 : "+sum);
		
		System.out.println("");
		
		
		
		// 3. 거꾸로 출력하기
		System.out.print("거꾸로 출력 : ");
		 for(int i=4; i>=0; i--) {
			 System.out.print(kors[i]+" ");
		 }
		 System.out.println("");
		
		 
		// 4. 평균보다 큰값 출력하기
		double avg = 0;
		
		for(int j=0; j<5; j++) {
			 avg=sum/5.0; 
			 }
		System.out.print("평균값 출력 : "+avg+" ");
		
		
		
		/*
		for(int j=0; j<5; j++) {
			 if(avg<kors[j]);{
				 System.out.println(kors[j]+" ");
			 }
			 
			}
		 */
		
	}

}
