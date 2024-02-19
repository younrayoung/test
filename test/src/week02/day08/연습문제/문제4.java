package week02.day08.연습문제;

public class 문제4 {

	public static void main(String[] args) {
		// 오늘 점심메뉴 추천해주는 함수 만들기

		String [] menu = {"김밥", "라면", "짜장면", "볶음밥", "파스타"};

		점심메뉴(menu);
	}
	
	public static void 점심메뉴 (String[] menu) {
		for (int i = 0; i < menu.length; i++) {
            System.out.println("숫자 " + (i + 1)+"을 골랐을 경우" + ": " + menu[i]);
        }
		}

	}
	
	
	
	


