package week02.day08;

public class b_함수_연습_4 {

	public static void main(String[] args) {
		
		별찍기(5);
	}

	
//-------------------------------------------------
	public static void 별찍기(int su) {
		System.out.println("< 별 1개로 3개, 3줄찍기 >");
		System.out.println();
		for(int i=0; i<su; i++) {
			for(int j=0; j<su; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
