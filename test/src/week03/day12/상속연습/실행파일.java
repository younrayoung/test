package week03.day12.상속연습;

public class 실행파일 {

	public static void main(String[] args) {
		
		//업캐스팅
		집청소[] h = new 집청소[2];
		h[0]=new 거실청소();
		h[1]=new 주방청소();
		
		
		for(int i=0; i<h.length; i++) {
			h[i].청소기돌리기();
			// 다운캐스팅
			if(h[i] instanceof 거실청소) {
				System.out.print("다운캐스팅사용 : ");
				((거실청소) h[i]).소독하기();
			}
		}
		

	}

}






//상속
// 상속이 자연스럽게 표현
// is a 가 성립되는 지 확인해 본다 