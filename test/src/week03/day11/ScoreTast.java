package week03.day11;

public class ScoreTast {

	public static void main(String[] args) {
		
		/*
			강지훈
			김기엽
			김수진
			김연수
			
			김예원
			김유진
			김종범
			박범준
			
			서원덕
			양홍섭
			여민혜
			유원준
			
			윤라영
			윤성진
			이건희
			이민재
			
			장유나
			정기원
			최환석
			함현지
		*/
		
		// 양홍섭 , 100 , 99
		//Score s = new Score("양홍섭", 100, 99); 
		//s.printInfo();
		
		// 윤라영
		Score s1 = new Score("윤라영", 98, 89);
		s1.printInfo();
		
		// 윤성진
		Score s2 = new Score("윤성진", 99, 79);
		s2.printInfo();
		
		// 이건희
		Score s3 = new Score("이건희", 88, 97);
		s3.printInfo();
		
		// 이민재
		Score s4 = new Score("이민재", 78, 87);
		s4.printInfo();
		
		
		
		//겍체배열
		Score[] Scores = new Score[4];
		Scores[0] = new Score("윤라영", 98, 89);
		Scores[1] = new Score("윤성진", 99, 79);
		Scores[2] = new Score("이건희", 88, 97);
		Scores[3] = new Score("이민재", 78, 87);
		
		System.out.println("객체배열 이용");
		Scores[0].printInfo();
		Scores[1].printInfo();
		Scores[2].printInfo();
		Scores[3].printInfo();
		
		System.out.println("갹체배열 이용 - 반복문");
		for(int i=0; i<Scores.length; i++) {
			Scores[i].printInfo();
		}
		
		
	}

}
