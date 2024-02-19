package week01.day03;

public class 매운맛06_쉬운버전 {

	public static void main(String[] args) {
		
		int incN=0, tempN=1, sum=0;
			while(incN<=5) {
				incN = incN + 1;
				tempN = tempN * incN;
				sum = sum + tempN;
				
			}
			System.out.println("sum="+sum);
	}
	

}
