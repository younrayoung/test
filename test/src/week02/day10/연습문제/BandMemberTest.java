package week02.day10.연습문제;

public class BandMemberTest {

	public static void main(String[] args) {
		
		BandMember bm;
		bm = new BandMember("홍길동", 25, "서울시", "싱어", "힙합", 15);
		bm.printInfo();
		
		
		BandMember bm1=null;
		bm1= new BandMember("최환석", 24, "부천시", "건반", "클래식", 19);
		bm1.printInfo();
		

		BandMember bm2 = new BandMember("홍길순", 31, "서울시", "드럼", "재즈", 2);
		bm2.printInfo();

		BandMember bm3 = new BandMember("박정민", 18, "화성시", "일렉", "k-pop", 5);
		bm3.printInfo();
		
		
		// 참조형변수 : 주소값을 담는 변수
		// 배열을 생성할 때, 객체를 생성할 때
		// new 연산자 ( 메모리 확보, 확보된 메모리의 주소를 반환 함)
		// 참조형변수의 기본값 : null 값 (아무것도 참조하지 않는다를 의미함)
		
		// 객체배열로 다루기   //members : 참조형 변수
		BandMember [] members = new BandMember[4]; //객체가 4개가 생성된 것이 아니다.
												   //참조형 변수가 4개가 만들어졋다.
		
		members[0]= new BandMember("홍길동", 25, "서울시", "싱어", "힙합", 15);
		members[1]= new BandMember("최환석", 24, "부천시", "건반", "클래식", 19);
		members[2]= new BandMember("홍길순", 31, "서울시", "드럼", "재즈", 2);
		members[3]= new BandMember("박정민", 18, "화성시", "일렉", "k-pop", 5);
		
		
		for(int i=0; i<members.length; i++) {
			members[1].printInfo();
		}
	/*
		members[0].printInfo();
		members[1].printInfo();
		members[2].printInfo();
		members[3].printInfo();
		
	*/	
		
		
		
	}

}
