package week02.day08.연습문제;

public class 문제8_평균반환 {

	public static void main(String[] args) {
		
		
		int[] a = {100,74,97,68,93};//평균점수 구할 값
		int result = 평균점수구하기(a);
		System.out.println("평균점수 => "+result);
	}


//--------------------------------------------
	public static int 평균점수구하기(int[] a) {
			
		 
			
		int sum=0; // 합계
		int avg = 0; // 평균
		for(int i=0; i<5; i++) {
			sum = sum+a[i];
		}
		avg= sum/5;
		return avg; 
		
	}
	
}
