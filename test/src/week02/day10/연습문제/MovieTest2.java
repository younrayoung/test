package week02.day10.연습문제;

import java.util.Scanner;

public class MovieTest2 {

	public static void main(String[] args) {
		//                    영화제목 / 감독 / 장르/ 출연자
		Movie2 m1 = new Movie2("서울의봄","김성수","액션/드라마","황정민");
        Movie2 m2 = new Movie2("괴물","봉준호","스릴러/액션","송강호");
        Movie2 m3 = new Movie2("명량", "김한민", "사극/전쟁","최민식");
        Movie2 m4 = new Movie2("7번방의 선물", "이환경", "로맨스/스릴러","류승룡");
      /*  Movie1 m5 = new Movie1();
        Movie1 m6 = new Movie1();


        m5.title = "1987";
        m5.director = "장준환";
        m5.genre = "드라마/느와르";
        m5.actor = "김윤석";

        m6.input("국제시장", "윤제균", "전쟁/드라마","황정민");

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
        m5.printInfo();
        m6.printInfo();
        
        */
        System.out.println("<영화제목 감독이름 장르 출연진 순으로 4종류 입력하세요.>");
        
        Movie2[] arr = new Movie2[4];
        //arr[0] = new Movie1("서울의봄","김성수","액션/드라마","황정민");
		//arr[1] = new Movie1("괴물","봉준호","스릴러/액션","송강호");
		//arr[2] = new Movie1("명량", "김한민", "사극/전쟁","최민식");
		//arr[3] = new Movie1("7번방의 선물", "이환경", "로맨스/스릴러","류승룡");
        
        Scanner sc = new Scanner(System.in);
		//입력
		for( int i=0 ; i<arr.length; i++) {
			/*
			 String title;
	    	String director;
	    	String genre;
	    	String actor;
			 */
			String title = sc.next();
			String director = sc.next();
			String genre = sc.next();
			String actor  =sc.next();			
			arr[i]= new Movie2(title, director, genre, actor);
		}
		
		
		
		//츨력
		for( int i=0 ; i< arr.length ; i++) {
			arr[i].showLck();
		}
        
    }
}
