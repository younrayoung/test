package week03.day11;


// 학생정보를 담을 자료형 정의
public class Score {
	 String name;
	 int kor;
	 int eng;
	 double avg;
	 //이정보가 new 에 만들어짐
	 
	 
	 // 데이타를 다루는 함수 (매서드를 ) 같이 정의함.
	 // 값을 입력하는 기능(생성자)
	 
	 
	 
	 // 기본 생성자
	 public Score() {
		 
		 
	 }
	 // 매개변수가 있는 생성자
	 public Score(String name, int kor, int eng) {
		 this.name = name;
		 this.kor=kor;
		 this.eng=eng;
		 this.avg=(this.kor+ this.eng)/2.0;
		 
		 
	 }
	 
	 //값을 출력하는 기능
	 public void printInfo() {
		 System.out.println(name + " " + kor + " " + eng + " " + avg);
		 
	 }
	
	
}
