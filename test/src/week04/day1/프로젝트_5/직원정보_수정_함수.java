package week04.day1.프로젝트_5;

import java.util.ArrayList;
import java.util.Scanner;

import week03.day14.프로젝트_3.직원관리;

@SuppressWarnings("unused")
public class 직원정보_수정_함수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			ArrayList<직원관리_수정> list = new ArrayList<>();
			
			System.out.println("[직원관리 프로그램을 시작합니다.]");
			loop:while(true) {
			System.out.println("메뉴를 선택하세요------  1.직원등록   2.직원전체조회   3.직원정보변경   4.직원정보삭제   5.종료");
			int menu = sc.nextInt();
			int index=0;
			switch(menu) {
				case 1 :
				직원등록하기(sc, list);
					break;
//----------------------------------------------------------------------------------------------	
				case 2:
					System.out.println("* 전체 직원 리스트 *");
					for(int i=0;i<list.size();i++) {
						System.out.println((i + 1)+"  " +list.get(i).toString());
					}
					break;
//----------------------------------------------------------------------------------------------
				case 3:
				직원변경하기(sc, list);
					break;
//----------------------------------------------------------------------------------------------
				case 4:
				직원삭제하기(sc, list);
					break;
//----------------------------------------------------------------------------------------------
				case 5:
					System.out.println("---- 프로그램 종료 ----");
					break loop;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
		
			}
	}

	private static void 직원등록하기(Scanner sc, ArrayList<직원관리_수정> list) {
		System.out.println("[등록할 직원의 정보를 입력하세요.]");
		System.out.println("ex) 홍길동 010-9876-5432 1234 ㅇㅇ부 직급");
		String name = sc.next();
		String tel = sc.next();
		String number = sc.next();
		String division = sc.next();
		String position = sc.next();
		직원관리_수정 s = new 직원관리_수정(name,tel,number,division,position);
		list.add(s);
		System.out.println("----직원 등록이 완료되었습니다.----");
		System.out.println();
	}
	
	private static void 직원변경하기(Scanner sc, ArrayList<직원관리_수정> list) {
		System.out.println("[ 직원 정보를 변경합니다. ]");
		System.out.println("* 전체 직원 리스트 *");
		for(int i = 0; i < list.size(); i++) { // 직원리스트 출력
		    System.out.println((i + 1) + ". " + list.get(i));
		}
		
		System.out.println("변경할 직원의 번호를 선택하세요.");
		int empIndex = sc.nextInt(); // 직원인덱스 번호 입력
		if (empIndex >= 1) {
			if (empIndex <= list.size()) {
				
			}
				System.out.println("[ 수정할 정보를 선택하세요 ]");
				System.out.println("1.연락처   2.내선번호   3.부서   4.직급");
				int menu2 = sc.nextInt();
				직원관리_수정 empChange = list.get(empIndex - 1);
				
				switch(menu2) {
				case 1:
					System.out.println("수정할 연락처를 입력하세요.");
					String phone = sc.next();
					empChange.setTel(phone);
					break;
				case 2:
					System.out.println("수정할 내선번호를 입력하세요.");	
					String n = sc.next();
					empChange.setNumber(n);
					break;
				case 3:
					System.out.println("수정할 부서를 입력하세요.");
					String d = sc.next();
					empChange.setDivision(d);
					break;
				case 4:
					System.out.println("수정할 직급을 입력하세요.");
					String p = sc.next();
					empChange.setPosition(p);
					break;
				default:	
					System.out.println("1~4번 중에서 입력하세요.");
				}
				System.out.println("---- 정보변경이 완료되었습니다. ----");
				
			}else {
				System.out.println("---- 해당 직원은 리스트에 없습니다. ----");
			}
	}

	private static void 직원삭제하기(Scanner sc, ArrayList<직원관리_수정> list) {
		System.out.println("직원 정보 삭제.");
		System.out.println("* 전체 직원 리스트 *");
		for(int i=0;i<list.size();i++) {
			System.out.println((i + 1)+"  " +list.get(i).toString());
		}
		System.out.println("삭제할 직원의 번호를 입력하시오.");
			//String worker = sc.next();
			//int worker2 = Integer.parseInt(worker);
		int worker = sc.nextInt();
		list.remove(worker-1);
System.out.println("---- 삭제되었습니다. ----");
	}

	
}