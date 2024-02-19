package week01.day05;

public class 연산자3 {

	public static void main(String[] args) {
		// 관계연산자
		
		// > , < , >= , ==(같다) , !=(같지않다)

		int myAge=27;
		boolean result = myAge > 25; // 25보다 크다 true
		System.out.println(result);
		
		boolean result2 = myAge >= 25; // 25보다 크거나 같다 true
		System.out.println(result2);
		
		boolean result3 = myAge < 25; // 25보다 작다 false
		System.out.println(result3);
		
		boolean result4 = myAge <= 25; // 25보다 작거나 같다 false
		System.out.println(result4);
		
		int yourAge=26;
		boolean result5 = yourAge == 26; // 26과 같다 true
		System.out.println(result5);
		
		boolean result6 = yourAge != 26; // 26과 같지 않다 false
		System.out.println(result6);
		
		
		
		
		// 논리연산자
		// 조건이 여러개 있을 때 그리고, 이거나, 부정 할 때 사용함
		
		int kor=80;
		int eng=100;
		
		// 두 과목 모두 90점이상이면 장학금 지급
		boolean result7; // false
		result7 = kor >= 90 && eng >=90; // 이고(and) && 둘 다 만족해야 함 
		System.out.println(result7);
		
		
		// 두 과목 중에서 한 과목이라도 90이상이면 장학금 지급
		boolean result8; // result8=>true
		result8 = kor >= 90 || eng >=90; // 둘 중 한개라도 만족하면 참
		System.out.println("result8=>"+ result8);
		
		
		
		
		// 부정  논리부정, !참 => 거짓 , !거짓 = 참
		boolean result9; // 
		result9 = (kor >= 80);
		//				!(참);
		System.out.println(result9);
		
		
		
		//복합대입연산자
		// += , -= , *= , %=
		
		int num=10;
		num = num+10; // 20  => num+10 이나 +=10 같은말
		num +=10; // 30	 => 위에서 20으로 num을 만들고 내려오고 거기에 10더함
	
		
		int su=2;
		su = su*3; // 6  => [su*3] 이나 [*=3]같은말
		su *=3;  // 18 
		
		
		
		// 삼항연산자
		// (조건)?참:거짓
		int result10 = (15>3)?15:3;
		System.out.println(result10);
		
		
		int m=10;
		int n=15;
		//        (조건)?참:거짓
		int max = (m>n)?m:n;
		System.out.println("두 수중에 큰값은? "+ max);
	}

}
