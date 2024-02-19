package week03.day12.상속Inheritance.동물;

public class Cat extends Animal {

	
	public void 쥐를잡는다() {
		  System.out.println("쥐를잡는다");
		}
	
	//부모의 매서드 재정의 override
	//부모것이랑 똑같아야 함. 달라지는 순간 새로운거를 입력했다고 생각함.
	//부모에 반드시 있어야 한다.
	//@Override => 부모의 매서드를 재정의 한다는 것을 표시
	
	
	
	//컨트롤+스페이스 해서 짖는다 불러오기 가능.
	@Override
	public void 짖는다() {
		System.out.println("야옹~");
	}
}
