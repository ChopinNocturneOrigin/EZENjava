package days04;

import java.util.Scanner;

public class ControllOpFor05 {

	public static void main(String[] args) {
		// 입력 받은 숫자 중 작은 숫자부터 큰 숫자까지 모든 정수를 출력하세요.
		int i, a, b, swapTemp;

		Scanner scannerInput = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		a = scannerInput.nextInt();
		System.out.print("두번째 정수 입력 : ");
		b = scannerInput.nextInt();

		scannerInput.close();
		
		if (a > b) {
			swapTemp = b;
			b = a;
			a = swapTemp; 
		}
		
		for (i = a; i <= b; i++) System.out.print(i + " ");

	}

}
