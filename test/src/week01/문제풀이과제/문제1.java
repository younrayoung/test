package week01.문제풀이과제;

public class 문제1 {

	public static void main(String[] args) {
		// 1~10까지 합 구하기

		
		//whlie문 사용
		int n=1, sum=0;
			while(n<=10){
				sum=sum+n;
				n=n+1;
			}
		System.out.println(sum);
		System.out.println("=====");
		
		
		//for문 사용
		
		int sum2 = 0;
		//int i;
		for(int i=1; i<=10; i++) { // int i를 선언할경우 for문안에서는 int빼기
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println("=====");
		
		
		//for문 사용해서 1~10까지 적기
		
		for(int i=1; i<10; i++)
			System.out.println(i);
		
		
		
	}

}
