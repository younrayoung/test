package week02.day08.연습문제;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		약수구하기();
	}

	
	
	public static void 약수구하기() {
        int number = 6;

        System.out.print(number + "의 약수: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
