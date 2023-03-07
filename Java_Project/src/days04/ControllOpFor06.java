package days04;

import java.util.Scanner;

public class ControllOpFor06 {

	public static void main(String[] args) {

		int k, factorial = 1;
		Scanner scannerInput = new Scanner(System.in);
/*	
		int sum = 0;
		System.out.print("합계를 구할 끝 숫자를 입력하세요 : ");
		k = scannerInput.nextInt();
		for (int i = 1; i <= k; i++) sum +=i;
		System.out.printf("1 ~ %d의 합계 => %d", k, sum);
*/		
		System.out.print("출력할 팩토리얼을 입력하세요 : ");
		k = scannerInput.nextInt();
		scannerInput.close();
		
		System.out.printf("%d! = ", k);
		for (; k > 1 ; k--) { 
			factorial *= k;
			System.out.print(k + " x ");
		}
		System.out.printf("1 = %d\n", factorial);

	}

}
