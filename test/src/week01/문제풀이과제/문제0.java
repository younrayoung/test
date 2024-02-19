package week01.문제풀이과제;

public class 문제0 {

	public static void main(String[] args) {
		// 자기정보 출력하기 (이름, 좋아하는 것 등 정수형, 실수형, 문자열, 문자, 논리형 변수 사용

		int a=10;
		int b=2;
		
		char c='윤';
		
		double sum= a+b;
				
		boolean result= a >b;
		
		
		System.out.println("나의 성은 "+c+" 입니다.");
		System.out.println("좋아하는 숫자는 "+b+" 입니다." );
		System.out.println("좋아하는 숫자의 합은 "+ sum +" 입니다." );
		System.out.println(a+"보다"+b+"가 작은 수이다="+result);
	}

}
