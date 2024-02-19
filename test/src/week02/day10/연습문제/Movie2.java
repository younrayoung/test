package week02.day10.연습문제;

public class Movie2 {

	String title;
    String director;
    String genre;
    String actor;

    public Movie2(String title, String director, String genre, String actor) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.actor = actor;
    }

    public Movie2() {
    }

    public void input (String title, String director, String genre, String actor) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.actor = actor;
    }

    public void printInfo() {
        System.out.print(title+", ");
        System.out.print(director+", ");
        System.out.print(genre+", ");
        System.out.print(actor+" ");
        System.out.println();
    }

	public void showLck() {
		System.out.println(this.title+" ");
		System.out.println(this.director+" ");
		System.out.println(this.genre+" ");
		System.out.println(this.actor+" ");
		System.out.println();
	
		
	}
}
	

