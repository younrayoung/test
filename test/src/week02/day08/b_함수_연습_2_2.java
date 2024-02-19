package week02.day08;

public class b_함수_연습_2_2 {

	public static void main(String[] args) {
		
		int time = 라면끓이기();
		System.out.println("총 소요시간=> "+ time+"분");
		System.out.println();
		
		if(time>=4) { // time >=4 && time <=5 ==> 4~5 사이값
			System.out.println("시간에 맞춰 잘 끓였네요!");
		}else{
			System.out.println("시간 조절이 필요합니다 :(");
		}
	}

//----------------------------------------------------------
	public static int 라면끓이기() {
		System.out.println("< 맛있게 라면 끓이는 방법 (기준 4분)>");
		System.out.println("1. 물을 올린다.");
		System.out.println("2. 면을 넣는다");
		System.out.println("3. 스프를 넣는다");
		System.out.println("4. 완성");
		System.out.println("============");
		
		
		return 4; // 소요시간
	}
	
}
