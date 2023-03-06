package days02;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 입력 받아서 1명의 성적표를 총점 평균과 함께 기존 성적표 양식에 맞춰 출력하세요.
		// 문자(이름)을 입력 받는 명령 -> sc.nextLine();
		// 입력 받을때 반드시 이름부터 입력 받으세요. 순서: 이름, 국어, 영어, 수학
		// 평균은 소수점 첫째자리까지 출력합니다.
		// printf 또는 println 선택은 자유입니다.
		int scoreKor, scoreEng, scoreMat, scoreSum;
		double scoreAvg;
		String studentName;
		
		Scanner scannerInput = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		studentName = scannerInput.nextLine();
		System.out.print("국어 성적을 입력하세요 : ");
		scoreKor = scannerInput.nextInt();
		System.out.print("영어 성적을 입력하세요 : ");
		scoreEng = scannerInput.nextInt();
		System.out.print("수학 성적을 입력하세요 : ");
		scoreMat = scannerInput.nextInt();
		
		scoreSum = scoreEng + scoreKor + scoreMat;
		scoreAvg = scoreSum / 3.0;

		System.out.println("\n\t\t     ### 성적표 ###");
		System.out.println("--------------------------------------------------------");
		System.out.println(" 번호      성  명    국어   영어   수학    총점    평균");
		System.out.println("--------------------------------------------------------");

		System.out.println(
				String.format("%4d%10s%7d%7d%7d%8d%9.1f",
					1,
					studentName,
					scoreKor,
					scoreEng,
					scoreMat,
					scoreSum,
					scoreAvg
					)
				);

		System.out.println("--------------------------------------------------------");
		
		scannerInput.close();

	}

}
