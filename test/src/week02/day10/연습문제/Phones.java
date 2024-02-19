package week02.day10.연습문제;



public class Phones {
    public static void main(String[] args) {
        // 핸드폰 객체
        Phone phone1 = new Phone("삼성", "S21", "블랙");
        Phone phone2 = new Phone("애플", "아이폰13", "화이트");
        Phone phone3 = new Phone("샤오미", "Mi 11", "블루");
        Phone phone4 = new Phone("구글", "픽셀 6", "그린");

       
        //핸드폰 정보 출력
        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();
        phone4.displayInfo();
    }
}

	// 핸드폰 클래스 정의
	class Phone {
	    private String brand;
	    private String model;
	    private String color;
	
	    
	    public Phone(String brand, String model, String color) {
	        this.brand = brand;
	        this.model = model;
	        this.color = color;
	    }
	
	    
	    public void displayInfo() {
	        System.out.println("브랜드: " + brand);
	        System.out.println("모델: " + model);
	        System.out.println("색상: " + color);
	        System.out.println();
	    }
	}
