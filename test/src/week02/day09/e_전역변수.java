package week02.day09;

public class e_전역변수 {

	//전역변수 : 모든 메서드에서 접근이 가능한 변수
	static int su=0;
	
	public static void main(String[] args) {
		// 수증가
		수증가하기();
		System.out.println(su + "수증가하기");
		
		수증가하기();
		System.out.println(su +"수증가하기");
	}

	
	public static void 수증가하기() {
		su++;
	}
	
	
}
