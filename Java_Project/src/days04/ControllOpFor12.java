package days04;

import java.util.Scanner;

public class ControllOpFor12 {

	public static void main(String[] args) {
		
		// 입력 받은 두개의 정수들의 공약수들을 출력하세요.
		// 12 36을 입력한 경우 1 2 3 4 6 12
		// 공약수가 모두 출력이 되었다면, 최대공약수를 따로 출력
		int num1, num2;
		int i, small, big;
		int set = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		sc.close();

		small = (num1 < num2) ? num1 : num2;
		big = (num1 > num2) ? num1 : num2;
		
		for (i = 1; i <= small; i++) 
			if (num1 % i == 0 && num2 % i == 0) System.out.printf("%d ", set = i);
		System.out.println("\n최대공약수 : " + set);
		
		System.out.println("\n최대공약수 : " + eucd(big, small));
		
	}

	static int eucd(int a, int b) {
		if (b == 0) return a;
		return eucd(b, a % b);
	}
}
