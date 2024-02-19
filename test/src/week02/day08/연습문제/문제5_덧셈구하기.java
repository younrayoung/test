package week02.day08.연습문제;

public class 문제5_덧셈구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		a=3;
		b=4;
		
		int result = 덧셈구하기(a,b);
		System.out.println(a+"+"+b+"="+result);
		
	}

	
	
//-----------------------------------------------	
	public static int 덧셈구하기(int su1, int su2) {
		int total;
		total=su1+su2;
		return total;
	}
	
}
