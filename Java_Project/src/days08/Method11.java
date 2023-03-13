package days08;

import java.util.Scanner;

public class Method11 {

	public static void main(String[] args) {

		boolean a;
		int year, tempInputInt = 0;
		boolean loopFlag;
		Scanner sc = new Scanner(System.in);
		
		do {
			loopFlag = false;
			try {
				System.out.print("년도를 입력하세요 : ");
				tempInputInt = sc.nextInt();
				if (tempInputInt < 1) loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			}
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);
		year = tempInputInt;
		
		a = checkYoonYear(year); // 년도를 전달인자로 전달하여 윤년이면 true, 평년이면 false를 리턴
		printOut(a); // 변수 a 값을 전달 받아 윤년 또는 평년을 출력하는 method

		sc.close();
	}
	
	public static boolean checkYoonYear(int i) {
		return (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0));
	}
	
	public static void printOut(boolean a) {
		if (a) System.out.println("윤년");
		else System.out.println("평년");
	}

}

// Method 사용에 따른 형태
// abc() : 전달인자 없고 리턴 값도 없는 형태
// abc(10, 20) : 전달인자 2개, 리턴 값 없는 형태
// k = abc() : 전달인자 없고, 리턴 값 있는 형태
// k = abc(10, 20) : 전달인자 2개, 리턴 값 있는 형태

// 개발자 필요에 의해 만들어지는 method는 반드시 클래스 안에 정의 되어야 하며
// 생성된 method들 간에는 자유롭게 서로를 호출하여 사용할 수 있습니다.
// 그들은 그들을 둘러싼 클래스에 속해 있는 멤버들이라고도 부릅니다.
// 다만 서로를 자유롭게 호출하는 대상에서 main method는 제외 합니다.
// main을 호출 한다는 것은 프로그램을 시작한다는 뜻이며, 개발자에 의해 임의 호출될 수 없습니다.
