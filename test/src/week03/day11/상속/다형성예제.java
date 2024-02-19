package week03.day11.상속;

public class 다형성예제 {

	public static void main(String[] args) {
		
		
		// Student 는 person 이다
		// StudentWorker 는 person 이다
		// Resercher 는 person 이다
		// proFessor 는 person 이다
		
		Student s1 = new Student();
		s1.먹기();
		StudentWorker s2 = new StudentWorker();
		s2.먹기();
		Resercher s3 = new Resercher();
		s3.먹기();
		Professor s4 = new Professor();
		s4.먹기();

		
		// 상속관계에서 자식의 객체를 부모형으로 다룰 수 있다. 부모형 참조형변수에 저장할 수 있다.
		// 아래와 같은 표현이 가능하다.
		// 왜?  => 상속을 통해서 부모형의 멤버가 있는 것이 보장되기 때문에
		// 자료형 => 해석의 도구
		// 업캐스팅이라고 부른다 (upcasting)
		person p = new Student(); // Student 안에 person 정보 들어가있음.
		person p2 = new StudentWorker();// StudentWorker 안에 person 정보 들어가있음.
		person p3 = new Resercher();// Resercher 안에 person 정보 들어가있음.
		person p4 = new Professor();// Professor 안에 person 정보 들어가있음.
		
		
		//
		System.out.println("========");
		
		person[] persons = new person[4];
		persons[0]= new Student();
		persons[1]= new StudentWorker();
		persons[2]= new Resercher();
		persons[3]= new Professor();
		
		
		for(int i=0; i<persons.length; i++) {
			persons[i].먹기();
		}
	}

}
