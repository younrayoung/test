package week02.day09;

public class a_수증가시키기 {
	
	
	
 // 클래스를 실행하려면 main 함수가 필요함
	public static void main(String[] args) {
		
		int su=0;
		su=su+1;
		System.out.println(su);
		
		su=su+1;
		System.out.println(su);
		
		
		//
		수증가하기1(su);
		System.out.println(su);
		
		
		// su 변수의 값을 변화시켜야함!
		su = 수증가하기2(su);
		System.out.println(su);

	}
	
	
	public static void 수증가하기1(int num) {
		System.out.println("수증가하기1에서 num="+num);
		num++; // num=num+1;
		
	}
	
	
	public static int 수증가하기2(int num) {
		//System.out.println(num);
		num++; // num=num+1;
		return num;
		
	}

}
