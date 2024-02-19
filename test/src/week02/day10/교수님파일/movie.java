package week02.day10.교수님파일;

public class movie {

	
	String 영화제목;
	String 감독;
	String 장르;
	String 출연진;
	
	
	// 입력
	public movie(String 영화제목,String 감독,String 장르,String 출연진) {
		this.영화제목=영화제목;
		this.감독=감독;
		this.장르=장르;
		this.출연진=출연진;
	}
	
	public movie() {
		
	}
	
	
	public void input(String 영화제목,String 감독,String 장르,String 출연진) {
		this.영화제목=영화제목;
		this.감독=감독;
		this.장르=장르;
		this.출연진=출연진;
	}
	
	
	
	
	public void 출력하기() {
		System.out.println(this.영화제목);
		System.out.println(this.감독);
		System.out.println(this.장르);
		System.out.println(this.출연진);
	}
	
	
	
}
