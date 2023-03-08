package days05;

import java.util.Scanner;

public class ControllOpWhile03 {

	public static void main(String[] args) {
		
		// 1. 컴퓨터가 내는 가위, 바위, 보를 랜덤하게 결정하여 저장합니다.
		String[] textRPS = {"가위", "바위", "보"};
		// double a = Math.random(); // 랜덤한 숫자를 소수점 아래의 숫자로 발생합니다.
		int comRPS = (int)(Math.random() * 3.0);
		int userRPS = 1;
		int inputNumber = 1;
		Scanner sc = null;
		sc = new Scanner(System.in);
		
		while (inputNumber != 0){
			do {
				System.out.print("가위(1)/바위(2)/보(3)/종료(0) 중 하나를 입력하세요 : ");
				inputNumber = sc.nextInt();
			} while (inputNumber < 0 || inputNumber > 3);
			if (inputNumber > 0) {
				userRPS = inputNumber - 1;
		
				System.out.printf("컴퓨터 : %s / 유저 : %s\n", textRPS[comRPS], textRPS[userRPS]);
				if (comRPS == userRPS) System.out.print("비겼습니다.");
				else if ((comRPS + 3 - userRPS) % 3 == 2) System.out.print("이겼습니다.");
				else  System.out.print("졌습니다.");
				// (comRPS + 3 - userRPS) % 3 => 2:win, 1:lose, 0:draw ~ (가위, 바위, 보) 순서
				System.out.println();
			}
		}
		
		sc.close();
	}

}
