package days04;

import java.util.Scanner;

public class ControllOpFor04 {

	public static void main(String[] args) {
		int dan;
		Scanner scannerInput = new Scanner(System.in);
		
		do {
			System.out.print("출력할 단을 입력하세요. (2 ~ 9) : ");
			dan = scannerInput.nextInt();
		} while (dan < 2 || dan > 9);

		// 입력한 숫자의 구구단을 출력하세요.
		for(int i = 1; i < 10 ; i++) System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
		
		scannerInput.close();
	}

}
