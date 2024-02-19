package week01.day03;

public class 서원덕_매웃맛06 {

	public static void main(String[] args) {
		/*
		 *   ★자료명세
		 *    입력:  X 
		 *    출력: 항의 누적합: sum  
		 *    처리:  반복제어 , 분자 :a
		 *         분모: b
		 *         항: an
		 *    s.c : MAX=10 
		 *  
		 * 
		 *   ★처리과정
		 *   반복
		 *     1. 카운트 증가
		 *     2. 분자를 구한다
		 *     3. 분모구한다  
		 *     4. 항을 구한다
		 *     5. 카운트판단(홀/짝)
		 *         홀수이면 합계에 더함
		 *         짝수이면 합계에 뺀다
		 *   
		 */
		
		
		
		//  변수선언
		 int a=0, b=1;
		 double an; // 항을 구할 변수
		 
		 double sum=0;
		 final int MAX=10;
		
		 while( a < MAX ) {
			 a=a+1;
			 b=b*a;			 
			 an = a/ (double)b;     //   10(정수)/3(정수)  =>정수  , (double)
			 System.out.println(  an);
			 
			 if( a%2 ==1) {
				 sum =sum +an;
			 }else {
				 sum = sum -an;
			 } 			 
		 } 
		 
		 System.out.println( sum);
	}

}