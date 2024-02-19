package week02.day07.문제풀이;

import java.util.Scanner;

public class 화폐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("출장비를 입력하세요.");
		        int n = sc.nextInt();
		        System.out.print(n + "->");

		        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

		        for (int unit : arr) {
		            int count = n / unit;
		            n %= unit;
		            System.out.print(unit + "원:" + count + " ");
		        }
		    }
		}
