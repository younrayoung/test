package week02.day08.연습문제;

public class 문제8번_혼자 {

	public static void main(String[] args) {
		
		int [] su = {55,78,44,16,23};
		
		for(int i=0; i<su.length; i++) {
			System.out.print("입력값 : "+su[i]+" ");
		}
		System.out.println(); 
		
		
		int result = 평균값(su);
		System.out.println("평균점수 => "+result);
	}


//---------------------------------------------
	public static int 평균값 (int[] su) {	
		
		
		int sum=0;
		int avg=0;
		for(int i=0; i<su.length; i++) {
			sum=sum+su[i];
		}
		avg=sum/su.length;
		
		return avg;
	
	}

}
