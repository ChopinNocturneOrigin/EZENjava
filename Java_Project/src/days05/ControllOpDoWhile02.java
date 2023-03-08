package days05;

import java.util.Scanner;

public class ControllOpDoWhile02 {

	public static void main(String[] args) {
		
		// 두개의 정수와 연사할 연산자를 입력 받아서 해당 연산의 결과를 출력하되
		// 연산과 출력이 끝나면 "계속 하시겠습니다? (Yes:1/No:2)"으로 물어보고
		// Y 를 입력하면 정수와 연산자 재입력 & 재연산
		// N 을 입력하면 프로그램 종료
		int n1, n2, operatorNumber, continueNumber;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("1번째 정수를 입력하세요 : ");
			n1 = sc.nextInt();
			System.out.print("2번째 정수를 입력하세요 : ");
			n2 = sc.nextInt();
			do {
				System.out.print("계산에 사용할 부호를 입력하세요(+:1, -:2, x:3, ÷:4) : ");
				operatorNumber = sc.nextInt();
				switch (operatorNumber) {
				case 1:
					System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
					break;
				case 2:
					System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
					break;
				case 3:
					System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
					break;
				case 4:
					if (n2 == 0) {
						System.out.println("0으로 나눌 수 없습니다.");
						break;
					}
					System.out.printf("%d ÷ %d = %f\n", n1, n2, (double)n1 / n2);
					break;
				default:
					System.out.println("부호 입력 오류");
				}
			} while (operatorNumber < 1 || operatorNumber > 4);
			do {
				System.out.print("계속 하시겠습니다? (Yes:1/No:2) : ");
				continueNumber = sc.nextInt();
				System.out.println();
			} while (continueNumber != 1 && continueNumber != 2);
		} while (continueNumber == 1);
		System.out.println("프로그램 종료");

		sc.close();
	}

}
