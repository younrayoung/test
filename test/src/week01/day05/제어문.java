package week01.day05;

public class 제어문 {

	public static void main(String[] args) {
		
		//  if문 , switch문(분기문)
		
		// if문 형식
		/* 1)	if(조건식) {
		 * 			조건이 참일 때 수행할 코드 
		 * 		}
		 * 
		 * 
		 * 2) 	if(조건식){
		 * 			참일 때 수행코드;
		 * 		}else{
		 * 			위의 조건이 아닌 그밖의 조건일 때
		 * 		}
		 * 
		 * 
		 * 3)	if(조건식){
		 * 			조건이 참일 떄 수행코드
		 * 		}else if( 조건식){
		 * 			위의 조건이 아닐 때 조건을 다시 확인해야 하는 경우 사용
		 * 		}else{
		 * 			위의 조건들이 모두 아닌경우 수행됨
		 * 		}
		 */

		/* if 사용시 주의 사항
		 * 
		 * 1)
		 * 		int kor=90;
		 * 		if(kor>=90){
		 * 			System.out.println("A");
		 * 		}else if(kor >= 80){
		 * 			System.out.println("B");
		 * 		}else{
		 * 			System.out.println("F");
		 * 		}
		 *  => 조건이 만족하는 경우 if문 종료됨 (위는 한덩이로 봄)
		 *  
		 * 2)	
		 * 		if(kor>=90){
		 * 			System.out.println("A");
		 * 		}
		 * 
		 * 		if(kor >=80){
		 * 			System.out.println("B");
		 * 		}
		 * 	=> A,B둘다 나옴 두덩이로 보니까
		 */
		
		int myAge=27;
		int yourAge=26;
		
		if(myAge > yourAge){
			System.out.println("내가 형이야");
		}
		
		if(myAge > yourAge){
			System.out.println("내가 형이야");
		}else {
			System.out.println("친구이거나 너가 형이야");
		}
		
		if(myAge > yourAge){
			System.out.println("내가 형이야");
		}else if(myAge == yourAge){
			System.out.println("우린 친구");
		}else {
			System.out.println("너가 형이야");
		}
		
		// 주의사항
		
		int score=99;
		char result='X';
		
		if (score>=90){
			// System.out.println("A학점");
			result='A';
		}
		
		if(score>=80){
			//System.out.println("B학점");
			result='B';
		}
		
		System.out.println("당신의 학점은 "+ result);
		
		
		
		//  성적에 따른 학점을 구하시오.
		score= 88;
		if (score >=90) {
			result='A';
		}else if(score >=80) {
			result='B';
		}else if(score >=70) {
			result='C';
		}else {
			result='F';
		}
		//
		System.out.println("당신의 학점은 "+ result);
	}

}
