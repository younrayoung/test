package week03.day11.스테틱변수;

public class ScoreTest {

	public static void main(String[] args) {


		Score s = new Score("유원준", 100,100,"우주연");
		s.printInfo();
		System.out.println();

		Score s2 = new Score("장유나", 99,100,"우주연");
		s2.printInfo();
		System.out.println();
		
		Score s3 = new Score("강지훈", 99,100,"우주연");
		s3.printInfo();
		System.out.println();
		
		int result = Score.cnt;
		System.out.println(result);
		
		
		Score s4 = new Score();
		s4.printInfo();
		
	}

}
