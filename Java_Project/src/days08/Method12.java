package days08;

import java.util.Scanner;

public class Method12 {

	public static void main(String[] args) {
		
		int a, b;
		double c;
		Scanner sc = new Scanner(System.in);
		
		a = myInput(1, sc); // 밑변을 입력 받음 "밑변을 입력하세요."라고 안내
		b = myInput(2, sc); // 높이를 입력 받음 "높이를 입력하세요."라고 안내
		// 전달인자가 1이면 밑변을 입력받아 리턴하는 method로
		// 2이면 높이를 입력 받아 리턴하는 method로 동작
		c = calculateArea(a, b); // 넓이를 계산
		printOut(c); // 넓이를 출력
		
		sc.close();

	}

	public static int myInput(int i, Scanner sc) {
		int tempInputInt = 0;
		boolean loopFlag;

		do {
			loopFlag = false;
			try {
				if (i == 1) System.out.print("밑변을 입력하세요 : ");
				else System.out.print("높이를 입력하세요 : ");
				tempInputInt = sc.nextInt();
				if (tempInputInt < 1) loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			}
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);

		//sc.close();
		return tempInputInt;
	}
	
	public static double calculateArea(int a, int b ) {
		return a * b * 0.5;
	}
	
	public static void printOut(double c) {
		System.out.printf("넓이 : %.1f", c);
	}
}
