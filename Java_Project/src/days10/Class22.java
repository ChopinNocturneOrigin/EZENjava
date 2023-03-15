package days10;

// static 키워드
// 멤버변수/메서드에 적용할 수 있는 키워드
// 정적변수/메서드(클래스의 변수/메서스)를 선언할 때 사용

// 자바 프로그램의 구동과정
// 1. JVM 에 의해서 실행 할 모든 클래스 중, static 메소드, static 멤버필드를 수집해서
//    메모리에 로딩되고, 프로그램의 시작(main 메서드의 실행)전에 메모리에 적재됩니다.
// 2. 메모리에 로딩된 static 메소드 중, main 이름을 검색
// 3. main 메서드가 검색 되었다면 JVM 해당 main 메서드를 호출하여 프로그램을 시작합니다.

// static 변수/메서드의 특징
// 프로그램 실행 후 메모리에 할당되고 실행되기를 기다리는 변수/메서드

// static이 아닌 변수/메서드의 특징
// Student std = new Student()와 같은 객체생성 명령이 있어야
// 메모리에 할당되고 호출가능 상태가 되는 변수/메서드

class StaticA {
	int num; // 인스턴스 멤버변수 - 멤버변수이면서 static이 아닌 변수(동적 멤버변수)입니다.
	static int number = 100; // static 멤버변수 - 역시 멤버변수입니다. static 멤버변수(정적 멤버변수)입니다.
}

public class Class22 {

	public static void main(String[] args) {
		
		// 1. 인스턴스 변수는 반드시 객체가 만들어진 이후에만 사용이 가능합니다.
		StaticA s1 = new StaticA();
		s1.num = 1000;
		System.out.println("s1 객체의 인스턴스 멤버변수 num : " + s1.num);
		
		// 2. Static 멤버변수는 객체의 생성 유무와 전혀 상관없이 그 변수를 사용할 수 있습니다.
		System.out.println("StaticA 클래스의 static 멤버변수 number : " + StaticA.number);
		
		// 스태틱 변수는 main 메서드 실행전에, 객체생성 전에 미리 생성되어 있는 변수
		// 수시로 생성되는 객체와는 달리 독립적이면서 클래스에는 종속적으로 사용하도록 생성됩니다.
		// 객체를 생성하지 않고도 사용할 수 있는 클래스의 멤버변수 입니다.
		// 다만 "클래스 외부"에서 static 변수에 접근하려면 위와 같이 클래스 이름과 함께 사용합니다.
		
		// Math.random(); // Math 클래스 안에 정의된 static 메서드 random();
		
		// 3. 인스턴스 변수는 객체 생성 시 마다 만들어져 객체의 갯수만큼 유지 되지만
		// 스태틱 변수는 프로그램 전체를 통틀어 한개만 만들어지고
		// 그 값도 객체와 상관없이 프로그램 종료시까지 유지됩니다.

		System.out.println();
		StaticA a2 = new StaticA();
		a2.num = 200;
		System.out.println("a2 객체의 인스턴스 멤버변수 num : " + a2.num);
		
		StaticA a3 = new StaticA();
		a3.num = 300;
		System.out.println("a3 객체의 인스턴스 멤버변수 num : " + a3.num);
		
		StaticA.number += 50; // 스태틱 변수 값의 변경
		System.out.println("StaticA 클래스의 static 멤버변수 number : " + StaticA.number);

		// 4. 인스턴스 변수와 마찬가지로 private로 보호되니 않았다면 아래와 같이 임의 접근이 가능하고
		StaticA.number = 10;
		System.out.println("StaticA 클래스의 static 멤버변수 number : " + StaticA.number);
		// private로 보호된 static 변수는 getter와 setter를 static으로 따로 제작해서
		// 값을 저장하거나 얻어 냅니다.
		// static이 아닌 인스턴스 메서드에서는 static 멤버변수/메서드의 접근이 "불가능"합니다.
	}

}
