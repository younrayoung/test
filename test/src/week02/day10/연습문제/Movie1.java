package week02.day10.연습문제;

import week02.day10.person;

public class Movie1 {

	String title;
    String director;
    String genre;
    String actor;

    public Movie1(String title, String director, String genre, String actor) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.actor = actor;
    }

    public Movie1() {
    	//  title = "1987";
        //  director = "장준환";
        //  genre = "드라마/느와르";
        //  actor = "김윤석";
    	
    //  this("서울의봄","김성수","액션/드라마","황정민");
    }

    public void printInfo() {
        System.out.print(title+", ");
        System.out.print(director+", ");
        System.out.print(genre+", ");
        System.out.print(actor+" ");
        System.out.println();
    }
    
    
}
	

