package days05;

import java.util.Scanner;

public class ControllOpLoopEx {

	public static void main(String[] args) {
		
		// 컴퓨터가 사용자에게 알려주지 않은 0 ~ 200 사이의 정수 값을 변수에 저장합니다.
		// 사용자가에게 컴퓨터가 저장하고 있을 숫자를 예측해서 입력하도록 합니다.
		// 입력된 숫자와 컴퓨터가 기억된 숫자를 비교해서 일치하면 게임종료
		// 일치하지 않으면 그 수치를 비교해서 Up 또는 Down을 출력합니다.
		// Up/Down을 보고 다시 입력하고 그리고 다시 비교해서 출력하고
		// 그렇게 맞출때까지 반복합니다.
		
		// 숫자를 맞추면, 다시 물어 봅니다. "다른 게임을 하시겠습니다?(Yes:1 / No:2) : "
		// 계속하겠다는 응답이 있으면 맨위 컴퓨터가 숫자를 다시 결정하는 곳부터 반복 합니다.
		// 게임 중간에라도 종료하고자 한다면 'Z'를 입력해서 종료 할 수 있게 해주세요.
		Scanner sc = new Scanner(System.in);
		int randomNumber, inputYN, inputNumber, count;
		String inputString;
		boolean exitFlag;
		
		do {
			count = 0;
			inputNumber = -1;
			exitFlag = false;
			randomNumber = (int)(Math.random() * 201);
			System.out.println("Guess What?");
			do {
				count++;
				System.out.printf("시도횟수 : %d회\n정수를 입력하세요 (0 ~ 200, 'Z':종료) : ", count);
				inputString = sc.next();
				if (inputString.equals("Z")) exitFlag = true;
				else {
					try {
						inputNumber = Integer.parseInt(inputString);
						if (inputNumber < 0 || inputNumber > 200) {
							System.err.println("0 ~ 200의 정수를 입력하세요.");
							count--;
							continue;
						}
					} catch (Exception e) {
						System.err.println("0 ~ 200의 정수 또는 Z를 입력하세요.");
						count--;
						continue;
					}
				}
				if (!exitFlag) {
					// System.out.printf("\nrandom number : %d\n", randomNumber); // for debug
					if (inputNumber == randomNumber) {
						System.out.printf("%d 정답입니다.\n\n", randomNumber);
						exitFlag = true;
					}
					else if (inputNumber < randomNumber) System.out.println("\nUp\n");
					else System.out.println("\nDown\n");
				}
			} while (!exitFlag);
			do {
				try {
					System.out.print("다른 게임을 하시겠습니다?(Yes:1 / No:2) : ");
					inputYN = sc.nextInt();
				} catch (Exception e) {
					System.err.println("1 또는 2의 정수를 입력하세요.");
					sc.nextLine();
					inputYN = -1;
				}
			} while (inputYN != 1 && inputYN != 2);
			System.out.println();
		} while (inputYN == 1);
		
		sc.close();
	}

}
