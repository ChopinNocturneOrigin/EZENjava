package days03;

import java.util.Scanner;

public class ControllOpIF01 {

	public static void main(String[] args) {
		// 정수를 하나 입력 받아서 그 정수가 짝수이면 "짝수입니다.", 홀수이면 "홀수입니다."라고 출력하세요.
		Scanner scannerInput = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scannerInput.nextInt();
		
		// 관계(비교) 연산의 결과에 의해서 지정한 명령(들)을 실행지 안할지를 결정하는 명령
		// 관계연산 또는 그 결과값(논리값)은 () 괄호안에, 실행할지 안할지의 명령들은 {} 중괄호 안에 넣어 줍니다.
		if (num % 2 == 0) System.out.println("짝수 입니다.");
		else System.out.println("홀수 입니다.");
		
		// if 문의 특징
		// () 안의 연산의 결과 또는 값이 true 이면 {} 안의 명령을 실행, false 이면 실행하지 않는 명령
		// () 안의 값이 true 이면 실행해야할 명령이 두개 이상일 수 있으므로,
		// {}로 그 경계를 구분해 줍니다. 실행하거나 실행하지 않을 영역 구분
		// () 안의 값이 true 일때 실행할 명령이 한개라면, 중괄호 {}를 생략할 수 있습니다.
		// 만약 ()안에 일부러 true 를 썼다면 -> if (true) {} : {} 안의 내용은 무조건 실행 됩니다.
		// 반대의 경우 if (false) {} : 무조건 {} 안의 내용을 실행 안하고 건너 뜁니다.
		// () 안에는 비교 연산과 논리연산이 조합된 복합 연산식 표현이 가능합니다.
		// if ((x == 0) && (y != 0) || (z == 0)) {}
		// () 안에는 비교 연산대신 true / false 값을 가지고 있는 boolean 변수도 들어갈 수 있습니다.
		
		boolean bResult = (num % 2) == 0;
		if(bResult)System.out.println("짝수입니다.");
		if (bResult == true) System.out.println("짝수입니다.");
		if (bResult == false) System.out.println("홀수입니다.");
		if (!bResult) System.out.println("홀수입니다.");
		if (num % 2 != 0) System.out.println("홀수입니다.");
		if (!(num % 2 == 0)) System.out.println("홀수입니다.");
		
		
		scannerInput.close();

	}

}
