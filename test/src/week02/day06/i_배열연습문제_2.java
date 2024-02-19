package week02.day06;

public class i_배열연습문제_2 {

	public static void main(String[] args) {
		// 2차원배열

		String[][] kakao = new String[2][5];
			
			kakao[0][0] = "라이언";
			kakao[0][1] = "어피치";
			kakao[0][2] = "무지";
			kakao[0][3] = "콘";
			kakao[0][4] = "춘식이";
			
			kakao[1][0] = "죠르디";
			kakao[1][1] = "망곰";
			kakao[1][2] = "쿼카";
			kakao[1][3] = "콘";
			kakao[1][4] = "몰랑이";
			
			
			for(int i=0; i<2; i++) {
				System.out.println("\n"+(i+1)+" 순위 캐릭터");
				for(int j=0; j<5; j++) {
					System.out.print(kakao[i][j]+" ");
				}
			}
			
			
		}

}
