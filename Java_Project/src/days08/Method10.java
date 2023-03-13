package days08;

import java.util.Scanner;

public class Method10 {

	public static void main(String[] args) {
		
		double n, d;
		int diaMeter, tempInputInt = 0;
		boolean loopFlag;
		Scanner sc = new Scanner(System.in);
		
		do {
			loopFlag = false;
			try {
				System.out.print("반지름을 입력하세요 : ");
				tempInputInt = sc.nextInt();
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			}
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);
		diaMeter = tempInputInt;

		n = calcCircleArea(diaMeter);
		d = calcCircleRound(diaMeter);
		printOut(n, d);

		sc.close();
	}
	
	public static double calcCircleArea(int d) {
		return d * d * Math.PI;
	}

	public static double calcCircleRound(int d) {
		return 2 * d * Math.PI;
	}
	
	public static void printOut(double n, double d) {
		System.out.printf("원의 넓이 : %.1f, 둘레 : %.1f\n", n, d);
	}
	
}
