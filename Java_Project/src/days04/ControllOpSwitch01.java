package days04;

import java.util.Scanner;

public class ControllOpSwitch01 {

	public static void main(String[] args) {
		int inputNumber;
		String outputText;

		Scanner scannerInput = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		inputNumber = scannerInput.nextInt();
		
		if (inputNumber == 1) outputText = "1을 입력 하셨습니다.";
		else if (inputNumber == 2) outputText = "2를 입력 하셨습니다.";
		else if (inputNumber == 3) outputText = "3을 입력 하셨습니다.";
		else if (inputNumber == 4) outputText = "4를 입력 하셨습니다.";
		else outputText = "1~4 이외의 값을 입력 하셨습니다.";
		
		System.out.print(outputText);

		// switch 문 : if 문과 비슷한 구조입니다.
		// 변수 값의 단순 참조일때 사용하며 변수 값이나 연산식의 값에 따라 실행할 명령이 선택됩니다.
		switch (inputNumber) {
			case 1:
				outputText = "1을 입력 하셨습니다.";
				break;
			case 2:
				outputText = "2를 입력 하셨습니다.";
				break;
			case 3:
				outputText = "3을 입력 하셨습니다.";
				break;
			case 4:
				outputText = "4를 입력 하셨습니다.";
				break;
			default:
				outputText = "1~4 이외의 값을 입력 하셨습니다.";
		}

		System.out.print(outputText);

		
		scannerInput.close();
	}

}
