package days03;

import java.util.Scanner;

public class ControllOpIF05 {

	public static void main(String[] args) {
		// 출생년도를 입력 받아서 나이를 계산하고 2023 - 입력한 년도 + 1
		// 12세 미만 어린이, 12 ~ 18세 청소년, 19 ~ 25 청년, 26세 이상(나머지) 성년 입니다. 라고 출력하는 if문 작성
		
		int year;
		int age;
		String resultString;
		Scanner scannerInput = new Scanner(System.in);
		System.out.print("출생년도를 입력하세요 : ");
		year = scannerInput.nextInt();
		
		age = 2023 - year + 1;
		if (age < 12) resultString = "어린이";
		else if (age < 19) resultString = "청소년";
		else if (age < 26) resultString = "청년";
		else resultString = "성년";
		
		System.out.printf("%d세, %s 입니다.\n", age, resultString);

		scannerInput.close();
	}

}
