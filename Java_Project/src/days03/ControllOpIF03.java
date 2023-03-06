package days03;

import java.util.Scanner;

public class ControllOpIF03 {

	public static void main(String[] args) {
		Scanner scannerInput = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNumber = scannerInput.nextInt();

		if (inputNumber > 0) System.out.println("양수 입니다.");
		else if (inputNumber == 0) System.out.println("0 입니다.");
		else System.out.println("음수 입니다.");
		
		System.out.println();
		
		int kor = 70, eng = 79, mat = 75;
		// 평균점수가 80 이상이면 합격, 70이상 79이라면 대기순번, 나머지는 불합격을 출력해 주세요.
		double avg = (kor + eng + mat) / 3.0;
		
		System.out.printf("평균점수 %.1f ", avg);
		if (avg >= 80) System.out.println("합격 입니다.");
		else if (avg >= 70) System.out.println("대기순번 입니다.");
		else System.out.println("불합격 입니다.");
		
		
		scannerInput.close();

	}

}
