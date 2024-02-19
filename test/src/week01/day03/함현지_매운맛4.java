package week01.day03;

import java.util.Scanner;

public class 함현지_매운맛4 {

	public static void main(String[] args) {
		
		
		//변수선언
		String name;
		int ko, math, eng;
		
		//출력
		int avg ; //개인의 평균
		int kAvg, mAvg, eAvg; //과목별 평균
		
		//처리
		int kSum=0, mSum=0, eSum=0; // 각 과목별 총점
		int count=0; 
		
		Scanner sc = new Scanner(System.in);
		while(true) {//무한 loop => 반드시 탈출조건 있어야함 
			name =sc.next();
			if(name.equals("0")) break;
			ko =sc.nextInt();
			math=sc.nextInt();
			eng=sc.nextInt();
			
			
			
			//과목별 총점에 누적
			kSum = kSum + ko;
			mSum = mSum + math;
			eSum = eSum + eng;
			
			avg=(ko +math+eng)/3;
			
			if(avg >=90) {
				System.out.println("excellent");
			}else {
				if(avg<=60) {
					System.out.println("fail");
				}
			}
			
			// 개인성적 출력
			System.out.println(name + ":" + ko +":"+ math + ":" + eng + ":"+avg);
			count=count +1; // count++;
		}
		
		kAvg = kSum /count;
		eAvg = eSum /count;
		mAvg = mSum /count;
		
		System.out.println(kAvg+","+eAvg+","+mAvg);
		

	}

}
