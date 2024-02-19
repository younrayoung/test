package week02.day10;


// 자동차 정보를 담을 수 있는 자료형 정의
// !! 자동차 정보(이름, 가격, 제조사)를 담고 싶다면 거기에 맞는 Class Type을 만들어야한다.
public class Car2 { // 변수를 정의한 것 

	// 멤버변수
	private String 이름;
	private String 제조사;
	private int 가격;
	
	
	// 멤버 매서드 : 멤버데이터를 다루는 기능(약속)
	
	
	// 입력
/*	
	public void input (String 이름, String 제조사, int price) {
		
		this.이름=이름;
		this.제조사 = 제조사;
		this.price = 가격;
	}
*/	
	// 생성자(특별한 매서드 : 함수)
	// 하는 일 : 객체(변수)의 값을 초기화하는 역할
	// 규칙 : 1. 반환타입을 쓰면 안됨. 
	//		 2. 이름은 반드시 클래스명과 동일하게 작성해야 한다.
	//		 3. 생성자를 작성하지 않으면 (만들지 않으면) 자동으로 기본 생성자를 만들어 준다.
	//		 4. 객체가 생성될 떄, 단 한번 호출된다.
	
	// 매개변수가 있는 생성자 
	public Car2(String 이름, String 제조사, int 가격) {
		
		this.이름 = 이름;
		this.제조사 = 제조사;
		this.가격 = 가격;
	}
	
	// 기본생성자
	public Car2() {
		
	}
	
	// 출력
	public void printInfo() {
		System.out.println(this.이름); // this 생략가능
		System.out.println(this.제조사);
		System.out.println(this.가격);
	}
}
