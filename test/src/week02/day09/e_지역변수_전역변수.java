package week02.day09;

public class e_지역변수_전역변수 {

	public static void main(String[] args) {


		// 지역변수 : 해당지역에서만 사용가능하다.
		// 한수지역 (스코프)
		// 블럭지역 (스코프)
		
		int su=0; // 그 지역에서 만들어진 함수 = 지역변수
		
		su= 수증가하기(su);
		System.out.println(su);
		
		
		int number=0;
		for(int i=1; i<=3; i++){
			int k=5; // 지역변수
			System.out.println("하이");
			number++;
		}
		
		for(int i=1; i<=3; i++){
			System.out.println("hi");
			number++;
		}
		
		System.out.println(number);
		//System.out.println(k); // 지역변수기 때문에 저 안에서만 사용가능
		
	}
	
	
	//
	public static int 수증가하기(int a) { // a = 지역변수
		a=a+1;
		return a;
	}

}
