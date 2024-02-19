package week01.day05;

public class 즘감연산자사용 {

	public static void main(String[] args) {
		
		
		// 1~10까지의 합
		
		int n=1;
		int sum=0;
		
		while( n<=10) {
			sum = sum +n;
			n=n+1;
		}
		System.out.println(sum);
		
		
		int i=1; 
		int sum2=1;				// 1				1
		while(i++ < 10) { 		// i ----- i++ --- sum2
			sum2 = sum2+i;		// 2		1		3
								// 3		2		6
								// 4		3		10
								// 5		4		15
								// 6		5		21
								// 7		6		28
								// 8		7		36
								// 9		8		45
								// 10		9		55
	
		
		}
		System.out.println(sum2);
	}

}
