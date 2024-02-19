package week03.day11;

// 피자정보를 저장할 수 있는 자료형 정의
public class Pizza {
	//멤버변수
	private String name;
	private String dough;
	private int price;
	
	
	//멤버매서드
	// 기능, 함수 (매서드)
	
	// 기본생성자
	public Pizza() {
		
	}
	
	// 생성자 
	public Pizza(String name, String dough, int price) {
		this.name = name;
		this.dough = dough;
		this.price = price;
	}
	
	// 생성자 
		public Pizza(String name, String dough) {
			this.name = name;
			this.dough = dough;
			this.price = 30000;
		}
	
	// order 매서드
	public void order() {
		System.out.println("~주문 받았습니다~");
		if(dough.equals("슈퍼시드")) {
			price += 2000;
			System.out.println("도우 "+dough+" 선택, 추가 금액 +2000");
		}else if(dough.equals("더블치즈엣지")) {
			price += 3000;
			System.out.println("도우 "+dough+" 선택, 추가 금액 +3000");
		}
		print();
	}
	
	// 현재정보를 출력하는 매서드
	//public void print(Pizza this) {
	public void print() {
		System.out.println("---주문 정보---");
		System.out.println("피자:"+this.name);
		System.out.println("도우:"+this.dough);
		System.out.println("가격:"+this.price);
		System.out.println("------------");
	}
}
