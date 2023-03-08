package days05;

import java.util.Scanner;

public class ControllOpWhile02 {

	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 짝수의 출력 : while 문을 이용해 주세요.
		
		int i = 0;
		while (i < 100)
			System.out.printf("%d ", i += 2);

		System.out.println();
		i = 0;
		while (i < 101)
			if (++i % 2  == 0)
				System.out.printf("%d ", i);
		
		// 정수를 입력 받아서 입력된 정수의 팩토리얼을 출력해 주세요.
		// while 문을 이용합니다.
		// 6을 입력하면 6! = 1 x 2 x 3 x 4 x 5 x 6 = 720
		
		int n, factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n팩토리얼을 계산할 정수 입력 : ");
		n = sc.nextInt();
		sc.close();
		
		System.out.printf("%d! = ", n);
		i = 1;
		while (i < n) {
			System.out.printf("%d x ", i);
			factorial *= i++;
		}
		System.out.printf("%d = %d", n, factorial * n);
		
	}

}
