package days04;

import java.util.Scanner;

public class ControllOPQuestionMark {

	public static void main(String[] args) {
		// 점수가 70점 이상이면 합격 아니면 불합격을 출력하세요
		// 단순 조건으로 둘 중에 하나 선택하여 실행 또는 연산하는 경우
		
		Scanner scannerInput = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scannerInput.nextInt();
		
		String printText;
		if (score >= 70) printText = "합격";
		else printText = "불합격";
		
		System.out.printf("입력한 점수는 %d점, %s입니다.", score, printText);
		
		printText = (score >= 70) ? "합격" : "불합격";
		// 괄호안의 비교연산이 true 이면 ':(colon)' 왼쪽의 "합격"이 false 이면 오른쪽의 "불합격"이 printText에 저장 
		System.out.printf("입력한 점수는 %d점, %s입니다.\n", score, printText);

		System.out.println();
		
		System.out.print("기본급을 입력하세요 : ");
		int baseMoney = scannerInput.nextInt();
		// 기본급 100만원 이상이면 50%, 100만원 미만이면 60% 가산하여 지급액을 출력
		
		double ratio = (baseMoney >= 1000000) ? 1.5 : 1.6;
		System.out.printf("총지급액 : %.0f\n", baseMoney * ratio);
		
		scannerInput.close();
	}

}
