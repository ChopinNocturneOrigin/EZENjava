package days06;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {

		// 야구 게임 프로그램

		// 컴퓨터가 나에게 알려주지 않은 숫자를 질문과 답변을 통해 맞춰가는 게임입니다.
		// 사용자에게 알려주지 않은 숫자 : 6 5 7 같은 한자리 숫자 세개를 준비하고
		// 질문 : 3 6 7 같은 한자리 숫자 세개를 입력 받아 비교합니다.
		// 답변 : 같은 숫자가 자리수까지 같으면 S 숫자만 같으면 B을 출력합니다.
		// 숫자 하나는 0 ~ 9까지... 세개의 숫자 중 중복 숫자 없음
		// 컴퓨터가 가지고 있는 숫자 : 5 6 8
		// 사용자가 컴퓨터에게 질문  : 4 5 8
		// 답변 -> 1S 1B

		// 1. 컴퓨터가 기억할 숫자를 저장할 배열, 사용자가 입력한 숫자를 저장할 배열생성
		// 2. 컴퓨터가 사용자에게 공개하지 않은 숫자(0 ~ 9) 세개를 발생시켜서 배열에 저장. 중복 x
		// 3. 사용자에게 세개의 숫자 (0 ~ 9까지의 숫자 세개)를 입력 받아서 배열에 저장.
		// 4. 랜덤 숫자와 유저 숫자 배열의 각 요소들을 서로 비교해서 같은 값이 있는지
		//    자리는 같은지 다른지 판단해서 S와 B를 예시처럼 출력합니다.
		// 5. 맞출때까지 (3S 0B) 2 ~ 4까지를 반복 합니다.

		// int num = Integer.parseInt(sc.nextLine());
		// user[0] = num / 100;
		// user[1] = (num % 100) / 10;
		// user[2] = num % 10;
		
		// String num = sc.nextLine();
		// user[0] = num.charAt(0) - '0';
		// user[1] = num.charAt(1) - '0';
		// user[2] = num.charAt(2) - '0';

		
		boolean endFlag = false, sameFlag, errFlag, inputFlag;
		int randomTemp, userGuessTemp, countStrike, countBall, count = 0;
		int[] comRandomNumber = {-1, -1, -1}; // 컴퓨터가 기억할 숫자를 저장할 배열
		int[] userGuessNumber = new int[3]; // 사용자가 입력한 숫자를 저장할 배열
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Baseball game : guess 3 numbers (0 ~ 9)");

		// 컴퓨터 숫자 생성
		for (int i = 0; i < 3; i++) {
			do {
				sameFlag = false;
				randomTemp = (int)(Math.random() * 10);
				for (int j : comRandomNumber) 
					if (j == randomTemp) sameFlag = true;
			} while (sameFlag);
			comRandomNumber[i] = randomTemp;
		}
		
		// 유저 루틴
		do {
			countBall = countStrike = 0;

			//System.out.println(Arrays.toString(comRandomNumber)); // for debug
			
			do {
				count++;
				errFlag = false;
				System.out.printf("-= %d회차 =-\n", count);
				System.out.print("숫자를 입력하세요 (예: 1 2 3) : ");
				try {
					for (int i = 0; i < 3; i++) {
						inputFlag = true;
						do {
							userGuessTemp = sc.nextInt();
							if (userGuessTemp >= 0 && userGuessTemp < 10) inputFlag = false;
							else System.err.println("0 ~ 9의 숫자를 입력하세요.");
						} while (inputFlag);
						userGuessNumber[i] = userGuessTemp; 
					}
				} catch (Exception e) {
					errFlag = true;
					sc.nextLine();
					System.err.println("입력 오류 입니다.");
				}
			} while (errFlag);
			
			for (int i = 0; i < 3; i++) {
				countStrike += (comRandomNumber[i] == userGuessNumber[i]) ? 1 : 0;
				for (int j = 0; j < 3; j++) {
					if (i == j) continue;
					countBall += (comRandomNumber[i] == userGuessNumber[j]) ? 1 : 0;
				}
			}
			if (countStrike == 3) endFlag = true;
			System.out.printf("%dS, %dB\n\n", countStrike, countBall);
		} while (!endFlag);
		System.out.println(Arrays.toString(comRandomNumber));
		System.out.println("정답 입니다.");

		sc.close();
	}

}
