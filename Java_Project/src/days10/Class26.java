package days10;

// 인스턴스 변수 값을 스태틱 변수 값으로 초기화 o
// 인스턴스 변수 값을 인스턴스 변수 값으로 초기화 o
// 스태틱 변수 값을 스태틱 변수 값으로 초기화 o
// 스태틱 변수 값을 인스턴스 변수 값으로 초기화 x

// 인스턴스 메서드는 스태틱 변수를 사용 o
// 인스턴스 메서드는 인스턴스 변수를 사용 o
// 스태틱 메서드는 스태틱 변수를 사용 o
// 스태틱 메서드는 인스턴스 변수를 사용 x

// 인스턴스 메서드 안에서 스태틱 메서드 호출 o
// 인스턴스 메서드 안에서 인스턴스 메서드 호출 o
// 스태틱 메서드 안에서 스태틱 메서드 호출 o
// 스태틱 메서드 안에서 인스턴스 메서스 호출 x

class MemberCall {
	int iv = 10; // 인스턴스 변수 : 객체가 생성될 때 생성되는 변수
	static int sv = 20; // static 변수 : 프로그램이 시작될 때 생성되는 변수
	
	int iv2 = sv; // 인스턴스 변수는 스태틱 변수 값으로 초기화가 가능
	// static int sv2 = iv; // 에러 : 스태틱 변수 값은 인스턴스 변수 값으로 초기화가 불가능
	// 맨 처음 생성되서 끝까지 남을 변수에 언제 만들어질지 모르는 인스턴스 값으로 초기화는 불가능
	
	// 억지로 인스턴스 변수로 static 변수를 초기화 하려면
	// MemberCall mc = new MemberCall();
	// static int sv2 = mc.iv;
	static int sv2 = new MemberCall().iv;
	// 억지로라도 인스턴스(멤버) 변수로 스태틱 변수의 값을 초기화 하고자 한다면 위와 같은 방법을 씁니다.
	// 레퍼런스 변수 없는 new 인스턴스를 만들어서 멤버변수 사용.
	// 그리나 이 방법을 억지로 사용하지는 않습니다.
	
	static void staticMehod() {
		System.out.println(sv); // 스태틱 메서드는 스태틱 변수를 사용할 수 있습니다.
		// System.out.println(iv); // 에러 - 스태틱 메서드는 인스턴스 변수를 사용할 수 없습니다.
		System.out.println(new MemberCall().iv);
		// 억지로라도 스태틱 메서드가 인스턴스 필드를 사용하려면 객체를 만들고 사용가능 - 권장 x
		staticMethod2(); // 스태틱 메서드에서는 스태틱 메서드 호출이 가능합니다.
		// instanceMethod2(); // 에러 : 스태틱 메서드에서는 인스턴스 메서드 호출이 불가능 합니다.
		new MemberCall().instanceMethod2(); // 이와 같은 호출은 가능합니다. - 권장 x
	}
	
	static void staticMethod2() {}

	void instanceMethod1() {
		System.out.println(sv); // 인스턴스 메서드는 스태틱 변수를 사용할 수 있습니다.
		System.out.println(iv); // 인스턴스 메서드는 인스턴스 변수를 사용할 수 있습니다.
		staticMethod2(); // 인스턴스 메서드에서는 스태틱 메서드 호출이 가능합니다.
		instanceMethod2(); // 인스턴스 메서드에서는 인스턴스 메서드 호출이 가능 합니다.
	}

	void instanceMethod2() {}
	
}

public class Class26 {

	public static void main(String[] args) {
		

	}

}
