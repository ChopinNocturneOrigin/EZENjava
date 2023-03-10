package days07;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {

		// 정수 하나를 입력 받아서 그 정수에 해당하는 구구단을 출력하세요.
		// 구구단 출력은 method를 이용해서 출력합니다. method 이름 doPrintGoogoodan

		boolean loopFlag;
		int tempInputInt = 0, danInputValue;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		do {
			loopFlag = false;
			try {
				tempInputInt = sc.nextInt();
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			}
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);
		danInputValue = tempInputInt;
		printGoogoodan(danInputValue);
		
		sc.close();
		
	}
	
	public static void printGoogoodan(int dan) {
		for (int i = 1 ; i < 10 ; i++)
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
	}

}
