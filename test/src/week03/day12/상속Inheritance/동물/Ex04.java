package week03.day12.상속Inheritance.동물;

public class Ex04 {

	public static void main(String[] args) {
		
		
		//다형성 : 상속관계에서만 존재함, 자식을 부모형으로 다룰 수 있는 것이 전재가 되어야 한다.
		Animal a = new Cat();
		Animal b = new Dog();
		
		
		a.짖는다();
		b.짖는다();
		
		
		
		Animal[] arr = new Animal[2];
			arr[0] = new Cat();
			arr[1] = new Dog();
			
		 for(int i=0; i<arr.length; i++) {
			 arr[i].짖는다();
		}	 
			 
		//다형성이란 Polymorphism
		//하나의 메세지(동일한 호출방법) => 다른결과가 수형되는 것 !!
		//상속관계에서 자식이 부모의 매서드를 재정의하는 것으로 다형성을 얻으 수 있다.
		 
	}

}
