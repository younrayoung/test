package week02.day08;

public class c_함수사용이유 {

	public static void main(String[] args) {
		
		// 성적표 타이틀 출력하는 코드
	/*	
		System.out.println("***************************");
		System.out.println("************성적표************");
		System.out.println("***************************");
*/
		printTitle();
		//
	/*
		System.out.println("***************************");
		System.out.println("************성적표************");
		System.out.println("***************************");
	*/	
		printTitle();
		
		
		printTitle();
		
	}
	
	
	// 코드 중복이 발생합니다.
	// 중복 => 코드가 많아짐, 코드수정 => 수정해야 할 코드가 많아짐 (실수가 발생할 수 있다.)
	// 코드블럭 => 별도의 함수로 작성 ( 함수 호출로 코드가 실행될 수 있도록 함.)
	
	
	// 기능 : 성적표 타이틀 출력기능 printTitle
	// 입력 : X
	// 반환 : X => void
	
	public static void printTitle() {// 시작
		
		/*System.out.println("***************************");
		System.out.println("************성적표************");
		System.out.println("***************************");
		*/
		
		System.out.println("/////////////////////////////");
		System.out.println("/////////////성적표////////////");
		System.out.println("/////////////////////////////");
		
		
	} // 끝
	
	

}
