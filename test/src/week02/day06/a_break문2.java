package week02.day06;

public class a_break문2 {

	public static void main(String[] args) {
		// 메뉴    1.등록  2.조회  3.변경  4.종료

		int menu=1;
		
		System.out.println("메뉴   1.등록  2.조회  3.변경  4.종료");
		switch(menu){
			case 1:
				System.out.println("등록합니다");
				break;
			case 2:
				System.out.println("조회합니다");
				break;
			case 3:
				System.out.println("변경합니다");
				break;
			case 4:
				System.out.println("종료합니다");
				break; //생략가능
				
		}
	}

}
