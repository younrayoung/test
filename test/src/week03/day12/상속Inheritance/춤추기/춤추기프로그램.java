package week03.day12.상속Inheritance.춤추기;

public class 춤추기프로그램 {

	public static void main(String[] args) {
		
		//15객체 생성 배열 담기
		Person[] persons = new Person[15];
		persons[0] = new 강지훈();
		persons[1] = new 김수진();
		persons[2] = new 김연수();
		persons[3] = new 김예원();
		persons[4] = new 김종범();
		persons[5] = new 박범준();
		persons[6] = new 양홍섭();
		persons[7] = new 여민혜();
		persons[8] = new 유원준();
		persons[9] = new 윤라영();
		persons[10] = new 윤성진();
		persons[11] = new 장유나();
		persons[12] = new 정기원();
		persons[13] = new 최환석();
		persons[14] = new 함현지();


		for(int i=0; i<persons.length; i++) {
			persons[i].춤추기();
			
			
			
		// 다형성
			// 동일한 메세지 persons[i].춤추기();  => 각기 다른 동작이 일어나게 하는것.
			
		
	}

	}
}
