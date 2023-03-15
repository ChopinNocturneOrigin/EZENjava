package days10;

// this 의 용도 #2
// 오버로딩 되어 있는 생성자들 간 서로를 재 호출하기 위한 이름으로 사용
// 호출하는 형태(매개변수의 형태)대로 생성자가 오버라이딩 되어 있어야 사용가능

class ThisB {
	private int num1;
	private int num2;
	private int num3;
	
	ThisB() {
	}
	
	ThisB(int num1) { // 생성자1
		this.num1 = num1;
		System.out.println("ThisB클래스의 생성자1이 호출 되었습니다.");
	}
	
	ThisB(int num1, int num2) { // 생성자2
		// this.num1 = num1;
		// ThisB(num1);
		this(num1); // 매개변수 한개를 가지고 있는 자신의 형제 생성자(생성자1), 오버로딩된 생성자를 호출
		this.num2 = num2;
		System.out.println("ThisB클래스의 생성자2가 호출 되었습니다.");
	}
	
	ThisB(int num1, int num2, int num3) {
		// this.num1 = num1;
		// this.num2 = num2;
		this(num1, num2); // 매개변수 두개를 가지고 있는 오버로딩된 생성자(생성자2)를 호출
		this.num3 = num3;
		System.out.println("ThisB클래스의 생성자3이 호출 되었습니다.");
	}
	
}

public class Class20 {

	public static void main(String[] args) {
		
		ThisB b1 = new ThisB(10);
		System.out.println();
		ThisB b2 = new ThisB(10, 20);
		System.out.println();
		ThisB b3 = new ThisB(10, 20, 30);

	}

}
