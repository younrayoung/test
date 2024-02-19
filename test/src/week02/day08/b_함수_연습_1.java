package week02.day08;

public class b_함수_연습_1 {
	
	public static void main(String[] args) {
		
		
		int age = 18;
		boolean result = 청소년할인(age);
		System.out.println("청소년할인 여부 => "+result);
	}

	
//--------------------------------------------
	public static boolean 청소년할인(int age) {
		if(age> 13) {
			return true;
		}else{
			return false;
		}	
	}
}
