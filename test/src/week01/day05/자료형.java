package week01.day05;

public class 자료형 {

	public static void main(String[] args) {
		
		// 변수 (메모리공간)를 선언시 공간의 크기와 공간의 내용을 해석하는 방법
		
		/*
		 * int    : 정수형 4byte ( +,- 21억 )
		 * char   : 문자형 2byte (한 문자 :'a' , '한'(   
		 * double : 실수형 8byte
		 * boolean: 논리형 (true, false)
		 */
		
		// 문자, 문자열(문자집합)을 구분해서 생각해야 합니다.
		
		// 기본자료형 => 값이 있다는 것
		int num=10;
		char ch='한';
		double dnum=25.56585;
		boolean result=true;
		
		System.out.println(num);
		System.out.println(ch);
		System.out.println(dnum);
		System.out.println(result);
		
		//
		// 정수형변수
		// byte, short, int(대표적), long
		
		// 실수형변수
		// float, double(대표적) 
		
		byte b=127; // 1byte ( -128~127)
		short s= 32767; // 2byte (-32768~32767)
		int i=2100000000; //4byte (-2147483648~2147483647)
		long l= 9223372036854775807L ; //( 922 3372 0368 5477 5807 L (약922경))
	}

}
