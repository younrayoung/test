package week01.day03;

public class 함현지_매운맛5 {

	public static void main(String[] args) {
		/*
		 * 자료명세
		 *  입력:   X 
		 *  출력:   항의 누적: sum
		 *  처리:   항:i  , 순번: count
		 * 
		 * 처리과정
		 * 
		 * 1.반복 (카운트가 7까지)
		 *    항을 구한다
		 *    항을 누적한다
		 *    카운트를 증가한다	
		 * 2. 항의누적을 출력  
		 * 
		 */
		
		
		//등비수열  (공비:3)
		//항의순번=>    1   2  3   4 ....7
		// 항   =>    2  6  18  54 
		//항의누적 =>   2  8   26 80     ?		
		
		//변수선언
		
		int i=2; // 항을 구할 변수
		int sum=0;
		int count=0;
		
		while( count <7) {
			sum += i;// sum = sum +i;
			i=i*3; // i *=3;
			System.out.println( i);
			count++;// count = count +1
		}
		
		System.out.println( sum);
	}

}
