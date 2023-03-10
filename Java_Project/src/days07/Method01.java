package days07;

// Method : function 이라고도 부르며 간헐적으로 반복되는 코드들을 별도로 정의(작성)해 놓고
// 정해놓은 이름으로 그 코드들의 이름을 불러서 실행하는 단위 실행코드들 입니다.
// Java에서는 function이라는 말보다 method라는 표현을 주로 사용합니다.

// 특징
// 1. 명령들이 모여서 기능을 정의하는 단위
// 2. 일련의 실행코드(명령)들을 묶어서 재활용 하고자 하는 목적 <- (제 1 목적)
// 3. method는 각 method마다 고유한 이름이 있습니다.
// 4. method가 이름이 불리워져서 실행되라는 명령(call-호출)을 받으면
//	  그 메서드의 몸체를 이루는 코드들이 실행되는 형식입니다.
// 5. Java의 method는 이름 뒤에 항상 괄호()를 달고 나옵니다.

// 6. method의 생성 : 반드시 클래스의 내부에서만 만들 수 있습니다.
// 7. main method 위 쪽 또는 아래 쪽에 만들 수 있습니다.

public class Method01 {
	
	// method 생성 가능 위치
	
	public static void main(String[] args) {
		
		System.out.println("프로그램이 시작 되었습니다.--------------");
		System.out.println("main method가 실행되고 있어요.-----------");
		
		System.out.println("\n@ printAbc method가 호출됩니다.");
		printAbc(); // abd method의 호출
		// method가 호출되면 호출된 method의 몸체로 포커스가 이동되어 그 몸체를 모두 실행하고
		// 원래 자리로 되돌아옵니다.
		System.out.println("@ printAbc method를 실행하고 돌아왔습니다.");

		System.out.println("아직 main method가 실행 중 입니다.-------");
		printAbc(); // printAbc method에 있는 코드가 필요할 때마다 언제든 이름을 불러서 호출(실행)할 수 있습니다.
		System.out.println("main method 실행 중----------------------");
		printAbc();
		System.out.println("프로그램 종료----------------------------");
		
	}

	// method 생성 가능 위치
	
	// method의 정의
	public static void printAbc() {
		System.out.println("첫번째 Print method가 실행되고 있어요~~!!");
		System.out.println("두번째 Print method가 실행되고 있어요~~!!");
		System.out.println("세번째 Print method가 실행되고 있어요~~!!");
		System.out.println("네번째 Print method가 실행되고 있어요~~!!");
	}
	// public static void : method 정의 할때 앞에 붙이는 문법 요소라고 생각하세요.
	// 개발자가 정의한 method는 이름도 개발자 마음대로 필요한 이름으로 정의 합니다.
	// 개발자가 정의한 method는 주로 main에서 간혹 다른 method에서 호출합니다.
	
}
