package week02.day10;

public class person_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		person a = new person();
		
		a.age = 40;
		a.name = "james";
		a.isMarried = true;
		a.kid = 3;
		
		person1(a);
		
	}

	
	public static void person1(person a) {
		System.out.println(a.age);
		System.out.println(a.name);
		System.out.println(a.isMarried);
		System.out.println(a.kid);
		
	}
	
}
