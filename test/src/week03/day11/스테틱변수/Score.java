package week03.day11.스테틱변수;

//성적을 저장할 수 있는 Score type 정의
public class Score {

	 // 인스턴스변수 : new 에 의해서 개별적으로 만들어짐(new에 의해서 공간 확보)
	String name;
	int kor;
	int eng;
	double avg;
							// new를 통해서 만들어지는 것이 아니다.
							// static 영역에 자동으로 확보
	static String teacher; // 클래스변수 => 한개만 만들어지고 같이 사용(공유)
	static int cnt=0;
	
	//기본생성자
	//생성자에서 생성자는 호출할 수 있다.
	public Score() {
//		this.name="아무개";
//		this.kor=10;
//		this.eng=20;
//		this.avg=(this.kor + this.eng )/2.0;
		
		// 생성자에서는 생성자를 호출할 수 있다. 위와 같은 의미
		this("아무개", 10 , 10,"우주연");
	}
	
	public Score(String name, int kor, int eng, String teacher) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.avg=(this.kor + this.eng )/2.0;
		this.teacher=teacher;
		
		cnt++;
	}
	
	
	public void printInfo() {
		 System.out.println(name);
		 System.out.println(kor);
		 System.out.println(eng);
		 System.out.println(avg);
		 System.out.println(teacher);
	
	}
	
	
	public static void printTitle() {
		 System.out.println("====================");
		 System.out.println("========성적표========");
		 System.out.println("====================");
	}
	
	
}
