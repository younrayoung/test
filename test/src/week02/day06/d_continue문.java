package week02.day06;

public class d_continue문 {

	public static void main(String[] args) {
		// continue 반복문에서 다음 반복으로 바로 진행될 수 있도록 하는 명령
		
		// 1 2 3 4 5 6 7 8 9 10
		// 1~10까지 수 중에서 홀수합 구하기
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) { // i가 짝수이면 아래코드를 수행하지말고 다음 반복으로 진행하도록 함
				continue;
			}
			sum=sum+i;
		}
		System.out.println(sum);
	/*
		1				0
		1		i%2		sum
		1		1		1
		2		0		1
		3		1		4
		4		0		4
		5		2		9
		6		0		9
		7		1		16
		8		0		16
		9		1		25
		10		0		25
	*/
		
		
		
		
		/*
		int sum=0;
		for(int i=1; i<=10; i++) {
			i=i+2;
			sum=sum+i;
		}
			System.out.println(sum);
		*/	
			
			
			
	}


}
