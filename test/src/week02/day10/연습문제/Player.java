package week02.day10.연습문제;

public class Player {
	//맴버변수 생성
	String name; //선수명
	int kick; //킥력
	int stamina; //지구력
	int intellect; // 판단력
	int quickness; // 순발력
	int popularity; //인지도
	
	//매개변수 있는 생성자 생성
public Player(String name, int kick, int stamina, int intellect, int quickness, int popularity) {
	this.name=name;
	this.kick=kick;
	this.stamina=stamina;
	this.intellect=intellect;
	this.quickness=quickness;
	this.popularity=popularity;
	
}
//출력 메소드 생성
public void printInfo() {
	
	System.out.println(name+"의 능력치는?");
	System.out.println("킥력: "+kick);
	System.out.println("지구력: "+stamina);
	System.out.println("판단력: "+intellect);
	System.out.println("순발력: "+quickness);
	System.out.println("인지도: "+popularity);
	
}

}
