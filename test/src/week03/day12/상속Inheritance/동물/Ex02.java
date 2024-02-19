package week03.day12.상속Inheritance.동물;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cat c = new Cat();
		Dog d = new Dog();
		
		Animal a= new Cat();
		Animal b= new Dog();
		
		
		Animal[] arr = new Animal[2];
		arr[0] = new Cat(); //애니멀로 작아진건 아님
		arr[1] = new Dog();
		
		
		
		arr[0].먹는다();
		arr[1].먹는다();
		
		System.out.println();
		
		//업캐스팅 : 자식객체를 부모형으로 다루는 것!
		//해석의 도구가 바뀐다. 실체가 바뀌는 것은 아니다.
		
		for(int i=0; i<arr.length; i++) {
			arr[i].먹는다();
			
			if(arr[i] instanceof Cat) {
				
				//다운캐스팅
				((Cat)arr[i]).쥐를잡는다();
			}
		}
		
		//업캐스팅과 다운캐스팅에서 실체가 바뀌지 않는다.  => 해석의 도구만 바뀌는 것 
		
		
		//잘못된 다운 캐스팅 예시
		Animal animal = new Animal();
		
		//실행시 runtime으로 ClassCastException(: 너가 클래스를 형변환하는데에 문제가 생겻다)
		Cat cat = (Cat)animal; //문법적으로 허용됨
		cat.쥐를잡는다();

		
	}

}
