package week02.day08;

public class a_함수예제3 {
					
	public static void main(String[] args) {
		//----------------------------
		a();
		//----------------------------
		b(555);
		//----------------------------
		int result = c();
		System.out.println(result);
		//----------------------------
		char result2 = d();// d() = A가 들어간다
		System.out.println(result2);
		//----------------------------
		별찍기();
		//----------------------------
		별찍기2(5);
		//----------------------------
		int[] result3 = 약수구하기();
		System.out.println(result3[0]);
		System.out.println(result3[1]);
		System.out.println(result3[2]);
		System.out.println(result3[3]);
		//----------------------------
		int result4=sum(5,8);
		System.out.println(result4);
	}
	
	
	
	// 함수이름 : a
	// 입력 : 입력없음(매개변수 없음=> ()빈괄호로 두면 매개변수 없음)
	// 반환 : 반환이 없다(void)
	public static void a() {
		System.out.println("a 함수 실행합니다");
	}
	
	
	//
	// 함수이름 : b
	// 입력 : int 형의 데이터를 받는다.
	// 반환 : 없다(void : 반환이 없다)
	public static void b(int a) {
		System.out.println("b 함수 실행합니다,"+ a +"값을 받아서 사용합니다.");
	}
	
	
	
	// 반환이 있는 함수, 반환하는 값의 type을 명시함
	// 반환은 반드시 1개여야 한다.
	//=================================
	// 함수이름 : c
	// 입력 : 없다.
	// 반환 : 있다. (int type의 값)
	public static int c() {
		return 7;
		
	}
	
	
	// 함수이름 : d
	// 입력 : 없다.
	// 반환 : 있다. (char type의 값)
	public static char d() {
		return 'A';
		
	}
	
	
	
	// 별찍기 함수 1
	public static void 별찍기(){
		System.out.println("별찍기 함수가 실행됩니다.");
		System.out.println("*");
	}
	
	
	// 별찍기 함수 2
	public static void 별찍기2(int su){
		System.out.println("별찍기 2함수가 실행됩니다.");
		for(int i=1; i<=su; i++) {
		System.out.println("*");
		}
	}
	
	
	// 반환을 여러개 해야 하는 경우, 배열을 사용함.
	public static int[] 약수구하기() {
		int[] 약수배열 = new int[4];
		약수배열[0]=1;
		약수배열[1]=2;
		약수배열[2]=3;
		약수배열[3]=6;
		return 약수배열;
		
		
	}
	
	
	// 두 수를 입력 받아서 더하는 기능
	public static int sum(int su1, int su2){ // su1,su2 매개변수
		
		int total;
		total = su1+su2;
		return total;
	}
	
}
