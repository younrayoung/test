package week01.day05;

public class 제어문반복분1 {

	public static void main(String[] args) {


		// 반복문, for(반복횟수 정해져 있을 때 ) , while, do~while(특정조건일 동안)

		
		// 별 하나를 이용해서 별을 3개 출력하시오.
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		
		//별 하나를 이용해서 별을 10개 출력하시오.
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		System.out.println("==========반복문");
		
		// 반복문을 사용
		for(int i=1; i<=10; i++) {
			System.out.println("*");
		}
		
		// 구구단, 별찍기
		
		// 3단출력
		// 반복문 사용해서 3단 출력하기
		
		//
		System.out.println("3*1="+3*1);
		System.out.println("3*2="+3*2);
		System.out.println("3*3="+3*3);
		System.out.println("3*4="+3*4);
		System.out.println("3*5="+3*5);
		System.out.println("3*6="+3*6);
		System.out.println("3*7="+3*7);
		System.out.println("3*8="+3*8);
		System.out.println("3*9="+3*9);
		System.out.println("============");
		
		// for 문을 이용해서 명령어 작성
		// for(){
		//		수행할 코드 (반복할 코드)
		//}
		
		// i+=2 2씩증가
		for(int i=1; i<=10; i++) { //초기식;조건식;증감식
			System.out.println("3"+"*"+i+"="+3*i);
		}
		
		// 내이름 5번 출력하기
		for(int i=1; i<=5; i++) { //초기식;조건식;증감식
			System.out.println("윤라영");
		}
		System.out.println("============");
		
		//규칙이 있는 것 반복하기
		
		//구구단 4단 출력
		for(int i=1; i<=10; i++) { //초기식;조건식;증감식
			System.out.println("4"+"*"+i+"="+4*i);
		}
		
	}

}
