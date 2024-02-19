package week02.day09;

public class snack_2 {

	public static void main(String[] args) {
		
		/*
		String 이름 = "뽀로로약과";
		String 가격 = "2000원";
		String 용량= "100g";
		*/
		
		snack a = new snack();
		
		a.이름 = "뽀로로약과";
		a.가격 = "2000원";
		a.용량 = "100g";
		
		System.out.println(a.이름 +" "+ a.가격 +" "+ a.용량);
		System.out.println();
		
		
		snack b = new snack();
		
		b.이름 = "빅파이";
		b.가격 = "4500원";
		b.용량 = "250g";
		
	
		System.out.println(b.이름);
		System.out.println(b.가격);
		System.out.println(b.용량);
	}

}
