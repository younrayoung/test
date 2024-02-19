package week02.day06;

public class b_합_10구하기 {

	public static void main(String[] args) {
		
		
		// 1  2 3 4 5 6 7 8 9 10
		/*
		int i=0;
		int sum=0; // 1~10까지의 합
		
		i=i+1; //1
		sum = sum +i; //1

		i=i+1; //2
		sum =sum+i; //3
		
		i=i+1; //3
		sum =sum+i; //6
		
		i=i+1; //4
		sum =sum+i; //10
		
		i=i+1; //5
		sum =sum+i; //15
		
		i=i+1; //6
		sum =sum+i; //21
		
		i=i+1; //7
		sum =sum+i; //28
		
		i=i+1; //8
		sum =sum+i; //36
		
		i=i+1; //9
		sum =sum+i; //45
		
		i=i+1; //10
		sum =sum+i; //55
		
		System.out.println(sum);
		*/
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println("===");
		
		int j=0;
		int sum2=0;	
		while(j<=10) {
			j=j+1;
			sum2=sum2+j;
		}
		System.out.println(sum);
	}

}
