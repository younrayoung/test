package week04.day1.프로젝트_5;

public class AdminLogin {

	String id;
	String pw;
	
	
	public AdminLogin() { // id, pw값 고정 시키기
		
		this.id = "admin";
		this.pw = "1234";
	}
		

	public boolean check(String id2, String pw2) { // 고정된 값과 입력된 값이 모두 같을 때를 체크
		return id2.equals(id)  &&   pw2.equals(pw);
		
	}
		
		
		
	}


	
	
