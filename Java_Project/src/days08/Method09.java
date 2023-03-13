package days08;

import java.util.Scanner;

// Method를 사용하는 세번째 목적
// Method 호출 후 method에서 계산된 결과를 호출한 지점에 리턴 받아서 사용하고자 할때

// 리턴 값이 존재하는 method를 사용하면 호출된 method가 return 명령을 이용하여 호출된 지점으로
// 결과 값 하나를 되돌려 보내서 활용할 수 있습니다.


public class Method09 {

	public static void main(String[] args) {
		int inputNumber, tempInputInt = 0, sq;
		boolean loopFlag;
		Scanner sc = new Scanner(System.in);
		
		do {
			loopFlag = false;
			try {
				System.out.print("정수를 입력하세요 : ");
				tempInputInt = sc.nextInt();
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			}
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);
		inputNumber = tempInputInt;
		
		sq = square(inputNumber); // square method는 전달인자로 전달된 값이 제곱을 계산하는 method
		// square method가 호출되고 계산해서 리턴해준 값을 sq변수에 저장합니다.
		// 마치 연산식의 결과를 왼쪽 변수에 대입하듯 저장합니다.
		// 그럼 아래와 같이 sq 변수에 담긴 값을 main method에서 활용할 수 있습니다. 
		System.out.printf("%d의 제곱은 %d입니다.\n", inputNumber, sq);
		
		int maxValue = max(10, 34, 67);
		System.out.printf("%d %d %d 중 가장 큰 숫자는? -> %d\n", 10, 32, 67, maxValue);
		
		max(20, 56, 35);
		// 리턴이 있는 method를 호출하고 그 리턴 값을 받아 줄 수 있는 변수를 쓰지 않았을때
		// 문법적으로 오류는 없지만 열심히 계산하고 그 결과를 버리는 셈이 됩니다.
		// 다만 리턴이라는 명령을 쓰는 목적은 실행 결과를 되돌려 받아서 쓰려는 목적이므로
		// 목적에 맞게 사용하는 것이 올바른 사용이라고 할 수 있습니다.
		maxValue = max(20, 56, 35);
		// 또한 method 실행의 결과(리턴값)는 변수에 저장할 수 있을 뿐만 아니라
		// 다름과 같이 다른 method 또는 연산ㄴ의 일부로 사용 할 수도 있습니다.
		System.out.printf("%d %d %d 중 가장 큰 숫자는? -> %d\n", 20, 56, 35, max(20, 56, 35));
		// 리턴된 값이 System.out.printf()의 출력 내용으로 사용됩니다.
		int k = 10 + max(20, 56, 35);
		// 리턴된 값이 10과 덧셈 연산이 실행됩니다.
		System.out.println(k);
		
		// Method가 호출되고 리턴되는 순간 그 리턴 값은 method 호출 문구를 대신하여 값으로
		// 다른 연산에 참여 합니다. (=, +, -, *, / 등)
		
		sc.close();
		
	}

	public static int square(int n) {
		return n * n;
		// Method가 실행된 결과를 되돌려주는 명령, 호출한 곳으로 되돌아가는 명령 : return
		// 그 동안 형식적으로 void라고 썼던 곳에 리턴되는 값의 자료형을 써줍니다.
		// 리턴 자료형은 method 생성과 동시에 고정 됩니다.
		// 그 동안 사용한 void는 리턴 값이 없다는 키워드 입니다.
	}
	
	public static int max(int a, int b, int c) {
		int max = a;
		max = (b > max) ? b : max;
		max = (c > max) ? c : max;
		return max;
	}
	
}
