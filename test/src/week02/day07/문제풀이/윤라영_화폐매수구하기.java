package week02.day07.문제풀이;

import java.util.Scanner;

public class 윤라영_화폐매수구하기 {

	public static void main(String[] args) {
		// 출장비가 입력될 때  출장비에 대한 화폐매수 (고액권부터)를 구하시오
		//  화폐단위 ( 50000,10000,5000,1000,500,100, 50,10 )
		//361200  - > 오만원: 7   만원:1  , 오천원: 0 , 천원: 1, 오백원: 0 , 백원: 2 , 오십원: 0 , 십원 :0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출장비를 입력하세요.");
		 
        int n = sc.nextInt();  // 출장비 입력
        System.out.print(n + "->");
        
        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10}; // 화폐단위
        int[] cnt = new int[8]; // 화폐 수 저장
        
        for (int i = 0; n > 0; i++) { // 출장비가 0이 될 때까지
            cnt[i] = n/arr[i]; // 출장비를 arr[i](화폐단위)로 나눠서 cnt[i](화폐 수)에 저장
            n = n % arr[i]; // 출장비를 arr[i]로 나누고 남은 나머지값 n에 저장 
        }
        /*
          int i=0;
        while(n>0) { // 출장비가 0이 될 때까지
            cnt[i] = n/arr[i]; // 출장비를 arr[i](화폐단위)로 나눠서 cnt[i](화폐 수)에 저장
            n = n % arr[i]; // 출장비를 arr[i]로 나누고 남은 나머지값 n에 저장 
            i++;
        }
         */
        
        System.out.println
        ("오만원:"+cnt[0]+" 만원:"+cnt[1]+" 오천원:"+cnt[2]+" 천원:"+cnt[3]
        		+" 오백원:"+cnt[4]+" 백원:"+cnt[5]+" 오십원:"+cnt[6]+" 십원:"+cnt[7]);
    }
}
		
			