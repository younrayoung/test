package week02.day10;

public class person2 {	
	private int age;
	private String name;
	private boolean isMarried;
	private int child;	
	
	// 매서드 : 함수(입력,출력)
	
	// input() 매서드를 통해서 값을 저장함 
	public void input(int age, String name, boolean isMarried, int child) { //함수의 매개변수라 위랑 똑같이 적을 필요는 없지만 같게 적음.
		this.age=age;
		this.name=name;
		this.isMarried=isMarried;
		this.child=child;
		
	}
	
	public void printInfo() {
		System.out.println( name);
		System.out.println( age);
		System.out.println( isMarried);
		System.out.println( child);
	}
}
