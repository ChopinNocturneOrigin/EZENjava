package days05;

import java.util.Scanner;

public class ControllOpFor16 {

	public static void main(String[] args) {
		// 정수하나를 입력 받아서 그 숫자가 소수(Prime number) 인지 아닌지를 출력합니다.
		// 1부터 자기 자신까지의 숫자로 모두 나눠보고 나누어 떨어지는 횟수가 딱 2번인 경우

		int number, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		number = sc.nextInt();
		sc.close();
		
		for (int i = 2; i < number / 2; i++) if (number % i == 0) count++;
		
		System.out.printf("정수 %d는 소수(Prime number)", number);
		if (count == 0) System.out.print("입니다.\n");
		else System.out.print("가 아닙니다.\n");

		
		// 1 ~ 100의 소수를 모두 출력해 주세요.
		System.out.println("\n1 ~ 100의 소수");
		for (int j = 2; j <= 1000; j++) {
			count = 0;
			for (int i = 2; i < j / 2; i++) if (j % i == 0) count++;
			if (count == 0) System.out.printf("%d ", j);
		}
		System.out.println();
		
	}

}
