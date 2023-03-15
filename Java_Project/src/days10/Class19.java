package days10;

// 복소수 : 5 + 3i
// i => root(-1) : -1의 제곱근 (허수)

class Complex {
	int real;
	int image;
	
	public Complex() {
	}

	public Complex(int i, int j) {
		real = i;
		image = j;
	}

	public void init(int i, int j) {
		real = i;
		image = j;
	}

	public void print() {
		System.out.printf("(%d + %di)\n", real, image);
	}

	public Complex add(Complex c) {
		Complex ct = new Complex();
		ct.real = this.real + c.real;
		ct.image = this.image + c.image;
		return ct;
	}

	public Complex subtract(Complex c) {
		Complex ct = new Complex();
		ct.real = this.real - c.real;
		ct.image = this.image - c.image;
		return ct;
	}

}

public class Class19 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.init(5, 6);
		Complex c2 = new Complex(2, 3); // 2는 실수부에 3은 허수부에 저장하는 생성자 호출
		c1.print(); // (5 + 6i) 형태로 출력되는 메서드 호출
		c2.print();
		System.out.println();
		
		Complex c3 = c1.add(c2); // 실수부는 실수부, 허수부는 허수부와 합산
		c1.print();
		c2.print();
		c3.print();
		System.out.println();
		
		c3 = c1.subtract(c2); // 실수부는 실수부, 허수부는 허수부와 감산
		c1.print();
		c2.print();
		c3.print();
		System.out.println();

	}

}
