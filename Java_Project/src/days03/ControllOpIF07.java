package days03;

import java.util.Scanner;

public class ControllOpIF07 {

	public static void main(String[] args) {
		Scanner scannerInput = new Scanner(System.in);
		String level; // 직급을 저장할 변수
		int pay; // 판매실적 금액 변수
		double workMoney;
		double totalMoney;
		double factor = 0.0;
		boolean chkError = false;
		
		System.out.print("직급 입력 (과장/대리/사원) : ");
		level = scannerInput.nextLine();
		
		System.out.print("판매실적 금액 입력 : ");
		pay = scannerInput.nextInt();
		
		// 판매실적 금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력해 주세요.
		
		if (level.equals("과장")) factor = 0.5;
		else if (level.equals("대리")) factor = 0.25;
		else if (level.equals("사원")) factor = 0.15;
		else chkError = true;
		
		if (pay < 0) chkError = true;
		
		if (!chkError) {
			workMoney = pay * factor;
			totalMoney = pay + workMoney;
			System.out.printf("판매실적 금액 : %d, 활동비 : %.0f, 총 지급액 : %.0f\n", pay, workMoney, totalMoney);
		} else System.out.println("!!! 입력 오류 !!!");
		

		scannerInput.close();

	}

}
