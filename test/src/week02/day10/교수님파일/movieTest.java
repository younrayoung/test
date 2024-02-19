package week02.day10.교수님파일;

public class movieTest {

	public static void main(String[] args) {
		
		
		movie m=new movie("명량","김철수","액션","홍길동");
		m.출력하기();
		
	
		movie m1 = new movie();
		
		m1.영화제목="명량";
		m1.감독="김철수";
		m1.장르="액션";
		m1.출연진="홍길동";
		
		m1.출력하기();
		
		
		movie m2= new movie();
		m2.input("영화제목","감독","장르","출연진");
		m2.출력하기();
		
	}

}
