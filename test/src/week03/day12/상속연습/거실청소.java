package week03.day12.상속연습;

public class 거실청소 extends 집청소 {

	public void 소독하기() {
		System.out.println("소독한다");
	}
	
	@Override
	public void 청소기돌리기() {
		System.out.println("깨끗하게-청소기를 돌린다");
	}
}
