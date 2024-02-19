package week02.day06;

public class a_break문 {

	public static void main(String[] args) {
		
		
		//while, for 반복문 break;
		//자신이 속한 반복문 빠져나옴
		
		//1~10까지의 합 구하기
		
		// 1  2 3 4 5 6 7 8 9 10
		
		int i=1;
		int sum=0;
		
		while(true) {
			i=i+1;
			sum=sum+i;
			if(i>=10) break;
		}
		System.out.println(sum);
	}

}
