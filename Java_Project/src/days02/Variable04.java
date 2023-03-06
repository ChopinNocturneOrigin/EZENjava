package days02;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		// 반지름을 입력 받아서 원의 넓이와, 둘레의 길이를 출력합니다.
		// 입력1, 출력2
		// 필요한 변수의 이름은 임의로 지어서 사용합니다.
		
		// 출력양식
		// 입력한 원의 넓이 : xx.xx , 둘레의 길이 : xx.xx
		
		// 원의 면적 : 반지름x반지름x3.141592
		// 원의 둘레의 길이 : 반지름x2x3.141592
		// 결과는 소수점 둘째자리까지만 표시. println 또는 printf 중 선택은 본인선택
		
		double circleRadius, circleArea, circleRound;
		Scanner scannerInput1 = new Scanner(System.in);
		
		System.out.println("-= 원의 면적 및 둘레의 길이 계산 =-\n");
		System.out.print("원의 반지름을 입력하세요.(실수) : ");
		circleRadius = scannerInput1.nextDouble();
		
		circleArea = Math.pow(circleRadius, 2) * Math.PI;
		circleRound = circleRadius * 2 * Math.PI;
		
		System.out.printf("원의 면적 : %.2f, 둘레의 길이 : %.2f", circleArea, circleRound);

		scannerInput1.close();
	}

}
