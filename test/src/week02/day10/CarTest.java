package week02.day10;

public class CarTest {

	public static void main(String[] args) {

		
		//
		Car c1 = new Car(); //자동차 정보를 담을 수 있는 변수가 만들어진 것임
		c1.input("산타페","현대", 3500); // input() 기능 사용
		c1.printInfo(); //printInfo() 기능 사용
		c1.input("k5","현대", 3500); // input() 기능 사용
		c1.printInfo(); //printInfo() 기능 사용
	
		
		int result = Math.max(5, 3); // 입력된 수중에 뭐가 더 크니
		System.out.println(result);
	}

}
