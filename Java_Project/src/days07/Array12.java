package days07;

import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		
		// 점수를 입력 받아서 해당 학점을 출력합니다.
		// if 문을 이용하지 않습니다. 배열을 이용합니다.
		// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
		char[] grade = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
		int score, tempScore = 0;
		boolean loopFlag;
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력 하세요 (0 ~ 100) : ");
		do {
			loopFlag = false;
			try {
				tempScore = sc.nextInt();
				if (tempScore < 0 || tempScore > 100) 
					loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			}
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);
		score = tempScore;
		
		System.out.printf("%d점, %c학점\n", score, grade[score/10]);
		// 배열의 첨자는 정수이므로 변수를 사용할 수도 있고 연산식을 넣어서 사용할 수도 있습니다.
		
		sc.close();

	}

}
