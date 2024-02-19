package week01.day05;

public class 연산자2 {

	public static void main(String[] args) {
		
		// 연산자 우선순위 
		// 증감연산자
		
		// a++, ++a, b--, --b
		// ++연산자(a++, ++a) : 공통점 => 변수의 값을 1 증가
		
		// --연산자(b--, --b) : 공통점 => 변수의 값을 1 감소

		int a=10;
		 //a++;
		 //++a;
		 
		int result1 = a++; //a=11, 연산의 결과 =>10 // 연산의 결과가 증가되기 전의 값을 반환
		int result2 = ++a; //a=12, 연산의 결과 =>12 // 연산의 결과가 증가된 후의 값을 반환
		
		int sum= 2+3; // 2+3=>5라는 연산의 결과가 발생함;
		
		//++ 증감연산자 이해하기
		int su1=10;
		int su2=10;
		
		int resultSu1;
		int resultSu2;
		
		resultSu1 = su1++;  // 1증가 -> 연산의 결과가 증가되기 전의 값을 반환
		resultSu2 = ++su2;  // 1증가 -> 연산의 결과가 증가된 후 값을 반환
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(resultSu1);
		System.out.println(resultSu2);
		System.out.println("=====");
		
		// b-- , --b : 공통점 => 1 감소   다른점 => 연산의 결과가 다름
		// b-- : 감소하기전의 값을 반환
		// --b : 감소한 후의 값을 반환
		
		int su3=10;
		int su4=10;
		
		int resultSu3;
		int resultSu4;
		
		resultSu3 = su3--;  // 1감소 -> 연산의 결과가 감소되기 전의 값을 반환
		resultSu4 = --su4;  // 1감소 -> 연산의 결과가 감소된 후 값을 반환
		
		
		System.out.println(su3);
		System.out.println(su4);
		System.out.println(resultSu3);
		System.out.println(resultSu4);
		System.out.println("====");
		
		
		// 문제풀어보기
		int p1=13;
		int p2=11;
		
		int resultp1;
		int resultp2;
		
		resultp1 = p1++ + ++p2;  //  13+12
		resultp2 = p2 + --p1;    //  12+13 -> 위에 저장한 값이 내려와서
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(resultp1);
		System.out.println(resultp2);
		
	}

}
