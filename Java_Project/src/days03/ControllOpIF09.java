package days03;

import java.util.Scanner;

public class ControllOpIF09 {

	public static void main(String[] args) {

		int a = (int)(Math.random()*3);
		
		String[] vsList = {"가위", "바위", "보"};

		String com = vsList[a];
		
		Scanner scannerInput = new Scanner(System.in);
		String user;
		
		System.out.print("가위/바위/보 중 하나를 입력하세요 : ");
		user = scannerInput.nextLine();
		
		System.out.println("컴퓨터 : " + com + " / " + " User : " + user);
		
		// 사용자를 기준으로 이겼습니다. / 무승부 입니다. / 졌습니다. 중 하나를 출력하세요.
		
		if (user.equals(com)) System.out.println("무승부 입니다.");
		else if (user.equals(vsList[0])) {
			if (com.equals(vsList[2])) System.out.println("이겼습니다.");
			else System.out.println("졌습니다.");
		}
		else if (user.equals(vsList[1])) {
			if (com.equals(vsList[0])) System.out.println("이겼습니다.");
			else System.out.println("졌습니다.");
		}
		else if (user.equals(vsList[2])) {
			if (com.equals(vsList[1])) System.out.println("이겼습니다.");
			else System.out.println("졌습니다.");
		} else System.out.printf("입력 오류 : %s\n", user);
		
		
		scannerInput.close();

	}

}
