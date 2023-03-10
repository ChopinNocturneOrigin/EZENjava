package days07;

// method를 사용하는 두번째 목적
// 명령들의 단순실행이 아닌 소정의 값을 연산하기 위한 명령들의 반복실행
// 예 : 사각형의 넓이를 계산하는 method, 삼각형의 넓이를 계산하는 method,
//      성적표를 양식에 맞게 출력하는 method, 달력을 양식에 맞게 출력하는 method

// 두번째 목적에 필요한 method를 그들이 실행되기 위해, 필요한 값들이 있습니다.
//   사각형의 넓이 : 밑변의 길이, 높이
//   성적표 : 국어, 영어, 수학, 총점, 평균
//   달력 : 년, 월
// 두번째 목적으로 method를 사용한다면 필요한 값들을 함수에 전달하고 실행되게 해야 합니다.
// 호출한 곳에서 넣어주는 값을 전달인자(argument)라고 부르고,
// method에서 전달된 값을 받아주는 변수를 매개변수(parameter)라고 부릅니다.

public class Method02 {

	public static void main(String[] args) {
		int n = 100;
		System.out.println("    main method의 지역변수 n 값 : " + n);
		printMy1();
		printMy2(300); // 300 : argument
		printMy2(n);
		// 전달인자로 변수를 넣으면 변수가 전달되는 것이 아니라 변수에 저장된 값의 복사본이 전달
		// method는 정의된 형태로 호출해야 정상 호출이 됩니다.
		// printMy2(100, 200, 300); // 에러 : 정의된 method의 호출에 맞지 않은 호출
		printMy3(100, 200, 300);
		// 매개변수의 갯수와 자료형이 다른 method가 필요하다면 추가로 정의하여 사용합니다.
		
		System.out.println("    main method의 지역변수 n 값 : " + n);

	}
	
	public static void printMy1() {
		int n = 200;
		System.out.println("printMy1 method의 지역변수 n 값 : " + n);
	}
	
	// 매개변수의 선언
	// public static void method이름(자료형 매개변수이름, 자료형 매개변수이름 ... ) {
	//
	// }
	// 괄호 안에 변수를 선언하고 쓰는 형식, 매개변수 또한 필요한 갯수만큼 선언해서 사용할 수 있습니다.
	// 전달인자(argument) : method 호출시 괄호 안에 넣어주는 데이터 
	// 매개변수(parameter) : method의 몸체의 괄호 안에 위치하면서 전달된 값을 받아주는 변수 
	public static void printMy2(int n) { // n : parameter
		System.out.println("printMy2 method의 지역변수 n 값 : " + n);
	}
	
	public static void printMy3(int a, int b, int c) {
		// 매개변수가 여러개라고 해서 하나의 int로 여러변수를 동시 선언하면 안됩니다.
		// 매개변수 int a, b, c : X
		System.out.printf("printMy3 method의 지역변수 a : %d, b: %d, c : %d\n", a, b, c);
	}
	// 전달인자와 매개변수는 자료형과 갯수 그리고 순서도 모두 일치해야 합니다.
}
