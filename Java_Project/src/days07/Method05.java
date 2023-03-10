package days07;

public class Method05 {
	
	static int number2;

	public static void main(String[] args) {
		int number = 100;
		number2 = 10;
		System.out.printf("       main method 내의 num 변수 값 : %d\n", number); // 100 출력
		System.out.println("전역변수 number2 값 : " + number2);
		System.out.println();
		updateValue(number); // updateValue method 호출
		System.out.println();
		System.out.printf("updateValue method 실행 후 main method 내의 num 변수 값 : %d\n", number);
		System.out.println("전역변수 number2 값 : " + number2);
		System.out.println();
	}
	
	// 호출한 지역(main)에서의 변수와 호출된 method의 매개변수 이름은 같아도 무방합니다.
	// 이름이 같은 두 변수는 서로 다른 변수이므로 각자의 지역에서 일련의 변화를 주어도
	// 서로의 값에 아무런 영향을 주지 않습니다.
	// 다만 호출한 지역에서 호출된 method에 변수 값을 전달해주기 위해
	// 전달인자 -> 매개변수 구조를 이용할 뿐입니다.
	// 이때도 전달인자로 변수를 지정했다면 이는 변수가 전달되는 것이 아닌라
	// 변수에 저장된 값의 복사본이 전달되므로 호출된 method의 연산으로부터 원본은 철저하게 보호됩니다.
	// 이렇게 값에 의한 호출을 call by value라고 합니다.
	
	public static void updateValue(int number) {
		number = 200;
		number2 = 20;
		System.out.printf("updateValue method 내의 num 변수 값 : %d\n", number); // 200 출력
		System.out.println("전역변수 number2 값 : " + number2);
	}

}
