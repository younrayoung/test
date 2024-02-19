package week01.문제풀이과제;

public class 문제12_2 {

	public static void main(String[] args) {


		
		// 6   =>    1  2  3  6 
		// 12  =>    1 2  3   4 6  12
		
		
		int su=6;  //  1, 2,3,,4,5,6
		
		
		//1약수 판별
		if( su % 1 ==0) {
			System.out.println(" 1은 약수");
		}
		
		if( su % 2 ==0) {
			System.out.println(" 2는 약수");
		}
		if( su % 3 ==0) {
			System.out.println(" 3은 약수");
		}
		if( su % 4 ==0) {
			System.out.println(" 4는 약수");
		}
		if( su % 5 ==0) {
			System.out.println(" 5는 약수");
		}
		
		if( su % 6 ==0) {
			System.out.println(" 6은 약수");
		}
	}

}
