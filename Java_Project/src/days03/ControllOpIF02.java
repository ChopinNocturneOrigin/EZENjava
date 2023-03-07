package days03;

import java.util.Scanner;

public class ControllOpIF02 {

	public static void main(String[] args) {
		
		Scanner scannerInput = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNumber = scannerInput.nextInt();
		int checkEven = inputNumber % 2;
		
		if (checkEven == 0) { 
			System.out.println("입력한 정수는 짝수(even)입니다.");
			checkEven = 1;
		}
		if (checkEven == 1) { 
			System.out.println("입력한 정수는 홀수(odd)입니다.");
		}

		checkEven = inputNumber % 2;
		if (checkEven == 0) {
			System.out.println("입력한 정수는 짝수(even)입니다.");
			checkEven = 1;
		} else {
			System.out.println("입력한 정수는 홀수(odd)입니다.");
		}

		System.out.println();
		int kor = 70, eng = 98, mat =95;
		double avg = (kor + eng + mat) / 3.0;
		// 평균이 80 이상이라면 합격 그렇지 않으면 불합격 이라고 출력
		System.out.printf("평균이 80 이상이라면 합격 그렇지 않으면 불합격\n평균 : %.1f\n", avg);
		if (avg >= 80) System.out.println("합격");
		else System.out.println("불합격");

		System.out.println();
		// 평균이 60 이상이거나 영어점수가 80 이상이라면 합격, 아니면 불합격
		System.out.printf("평균이 60 이상이거나 영어점수가 80 이상이라면 합격, 아니면 불합격\n평균 : %.1f, 영어: %d\n", avg, eng);
		if (avg >= 60 || eng >= 80) System.out.println("합격");
		else System.out.println("불합격");
		
		
		// 년도 하나를 입력 받아서 변수에 저장하고 입력한 년도가 윤년인지 평년인지를 출력하도록 if문을 작성하세요.
		System.out.println();
		System.out.print("년도를 입력하세요 : ");
		int year = scannerInput.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.printf("%d년은 윤년입니다.", year);
		else System.out.printf("%d년은 평년입니다.", year);
		
		
		scannerInput.close();
		
	}

}
