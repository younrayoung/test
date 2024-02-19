package week02.day10;

public class OrderTest2 {

	public static void main(String[] args) {
		 
		Order2 order  = new Order2(); //주문정보 1개 저장
		//Order2 order2  = new Order2();  // 주문정보 1개 저장
					// 두번째 변수를 사용하려면 새로 만들어야 쓸수 있음
		
		/*
		order.orderNo ="201803120001" ;
		order.id="abc123";
		order.orderDate ="2018년3월12일";
		order.name="홍길순";
		order.addr ="서울시 영등포구 여의도동 20번지";
		order.goodsNo="😛D0345-12";
		
		
		System.out.println( order.orderNo );
		System.out.println( order.id );
		System.out.println( order.orderDate );
		System.out.println( order.name );
		System.out.println( order.addr );
		System.out.println( order.goodsNo );
		 */
		
		order.input("201803120001", "abc123", "2018년3월12일",
				"홍길순", "서울시 영등포구 여의도동 20번지", "😛D0345-12");
		order.pritnInfo();
		
	}

}
