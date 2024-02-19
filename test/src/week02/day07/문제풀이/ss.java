package week02.day07.문제풀이;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] kors= { 90,80,99,89,100} ;	
		 int sum=0;
		 double avg=0;
		 
		 System.out.print("배열요소 출력 => ");
		 for(int i=0; i<5; i++) {
			 System.out.print(kors[i]+" ");
			 sum+=kors[i];
			
		 }
		 avg=sum/5.0;
		 
		 System.out.println();
		 System.out.println();
		 
		 System.out.println("sum => "+sum);
		 System.out.println();
		 
		 System.out.print("거꾸로 출력하기 => ");
		 for(int i=4; i>=0; i--) {
			 System.out.print(kors[i]+" ");
		 }
		 System.out.println();

		 System.out.println();
		 System.out.print("평균보다 큰 값 => ");
		 for(int j=0; j<5; j++) {
			 if(kors[j]>avg) {
				 System.out.print(kors[j]+" ");
			  }
		 }
		
	}

}
