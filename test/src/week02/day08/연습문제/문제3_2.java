package week02.day08.연습문제;

public class 문제3_2 {

	public static void main(String[] args) {
		// 주간 날씨정보를 반환하는 함수 만들기

		주간날씨();
		
	}
	
//-----------------------------------------------------
	
	public static void 주간날씨() {
		
		int[] 온도 = {9, 6, 4, 8, 7, 1, 3};
        String[] day = {"월", "화", "수", "목", "금", "토", "일"};

        System.out.println("이번주 최고 기온:");

        // 각 요일과 기온 출력
        for (int i = 0; i < 온도.length; i++) {
            System.out.println(day[i] + "요일" + " => " + 온도[i] + "도");
        }
        
    }

}
