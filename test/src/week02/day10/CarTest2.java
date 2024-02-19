package week02.day10;

public class CarTest2 {

	public static void main(String[] args) {

		
		//
		Car2 c1 = new Car2(); //자동차 정보를 담을 수 있는 변수가 만들어진 것임
		//c1.input("산타페","현대", 3500); // input() 기능 사용
		c1.printInfo(); //printInfo() 기능 사용
		
		
		Car2 c2 = new Car2("k7","기아", 4500);
		c2.printInfo();
		
		Car2 c3 = new Car2("k5","기아5", 5500);
		c3.printInfo();
		
		
		// static이 붙은 매서드를 호툴하는 방법
		// 클래스명.매서드()
		//int result = Math.max(5, 3); // 입력된 수중에 뭐가 더 크니
		//System.out.println(result);
	}

}
