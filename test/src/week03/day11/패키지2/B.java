package week03.day11.패키지2;

import week03.day11.패키지.A;

public class B {

	void 매서드1() {
		System.out.println("매서드");
		
	}
	
	// m 만 작성해도 나옴
	public static void main(String[] args) {
		//default 접근제어자는 같은 패키지에서만 접근 허용
		
		A a = new A();
		//a.매서드1();
		
	}
}
