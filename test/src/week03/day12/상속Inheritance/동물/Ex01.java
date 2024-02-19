package week03.day12.상속Inheritance.동물;

import week03.day11.패키지.C;

public class Ex01 {

	public static void main(String[] args) {
		
		
		Cat c = new Cat();
		
		c.먹는다();
		c.쥐를잡는다();
		
		
		//상속관계에서
		//부모클래스, 상위클래스, super (물려주는 클래스)
		//자식클래스, 하위클래스, sub클래스(물려받는 클래스)
		//자식의 객체를 부모형참조형변수로 다룰 수 있다.(상속관계에서는)
		//다룰 수 있는 이유 : 부모의 내용이 반드시 자식에 있기 때문에 부모형으로 다룰 수 있다.
		
		
		Animal animal=null; //참조형변수 기본값 => null 의미 : 참조하고 있지 않다라는 값
		
		animal = c; //업캐스팅(upcasting)
		
		animal.먹는다(); //업캐스팅 알아야 할 것 !!!, 부모형으로 축소됨		
					  // 자료형은 해석의 도구
		
					  //cat이 가지는 기능을 사용할 수 없다.
		
		//다운캐스팅    !!! 올바른 다운캐스팅을 하려면 실체, 객체가 누구인지 확인해야함 !!!
		//
		((Cat)animal).쥐를잡는다();
			// Cat형으로 변환하는 코트를 수행한 후 쥐를잡는다(); 매서드를 호출
		
		
		
		Cat cat = (Cat)animal; // 다운캐스팅, 명시적으로 들어내야 함
		cat.쥐를잡는다();
		
	}

}
