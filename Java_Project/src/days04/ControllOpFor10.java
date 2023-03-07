package days04;

import java.util.Scanner;

public class ControllOpFor10 {

	public static void main(String[] args) {
		// 정수 하나을 입력 받아서 1부터 입력 받은 정수까지 짝수의 합을 출력하세요.
		
		int sum = 0, num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++)
			if (i % 2 == 0) 
				System.out.printf("2부터 %d 까지의 짝수들의 합 : %d\n", i, sum += i);

		System.out.println();
		sum = 0;

		for (int i = 2; i <= num; i+=2)
			System.out.printf("2부터 %d 까지의 짝수들의 합 : %d\n", i, sum += i);

		System.out.println();
		sum = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) continue;
			// continue : 현재 반복실행의 명령을 다 실행가기 전에 현재 지점에서 실행중단 및 다음 반복으로 이동
			System.out.printf("2부터 %d 까지의 짝수들의 합 : %d\n", i, sum += i);
		}

		sc.close();
	}

}
