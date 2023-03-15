package days10;

// 스태틱변수는 클래스 내부에 존재하지만, 객체 생성과 관계없이 프로그램 시작전 한번만 생성되고
// 프로그램 종료시까지 변수가 갖는 값을 일관되게 유지 또는 변경 관리합니다.
// 가장 쉽게 활용하는 방법 : 일정 interval의 일련ㅂ너호, 생성된 객체의 갯수
//                           일관된 지표를 나타내는 기준값

class StaticB {
	int number;
	static int count = 0;
	public StaticB() {
		// 같은 클래스 내부에서는 static 변수도 클래스 이름을 붙이지 않고 사용합니다.
		count++; // 생성자에서 실행되므로, 객체가 생성될때마다 ++ 연산이 실행됩니다.
		number = count;
	}
}

public class Class23 {

	public static void main(String[] args) {
		
		System.out.printf("count = %d\n", StaticB.count);
		
		StaticB b1 = new StaticB();
		System.out.printf("b1.number = %d, count = %d\n", b1.number, StaticB.count);
		
		StaticB b2 = new StaticB();
		System.out.printf("b2.number = %d, count = %d\n", b2.number, StaticB.count);

		StaticB b3 = new StaticB();
		System.out.printf("b3.number = %d, count = %d\n", b3.number, StaticB.count);

	}

}
