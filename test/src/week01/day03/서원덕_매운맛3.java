package week01.day03;
/* 
★ 자료명세 
입력: 
출력:  첫째항 : a ,두번째항: b
처리:  반복횟수 : n 
★처리과정
 1.반복
   -카운트증가
   -카운트판단 
     홀수일때: 첫번째항 구하기
            첫번째항 출력
     짝수일때: 두번째항 구하기
            두번째항 출력
 */
public class 서원덕_매운맛3 {

	public static void main(String[] args) {
		
		
		//변수선언 		
				int a=1, b=0, n=0;
				final  int  MAX=7;
				
				while(n < MAX) {			
					n=n+1; // n++;
					if( n %2 ==1) {
						a=a+b;
						System.out.println(a);
					}else {
						b=a+b;
						System.out.println(b);
					}			
				} 
			}

		}