package days10;

// this 키워드의 용도 #1

// this 변수는 레퍼런스(참조) 변수입니다.
// 멤버변수 new 생성자()에 의해 새로운 공간 객체별로 각각 만듭니다.
// 반면에 멤버 메서드는 한개만 만들어지며, 각 객체들이 공유 및 호출해서 사용합니다.
// 이때 메서드 내에는 누가 자신을 호출했는지 구분하기 위해 this라는 참조변수를 준비해 놓고 있습니다.
// 호출한 객체의 참조 값이 this에 저장됩니다.
// this 변수는 따로 기술하지 않은 숨어 있는 변수입니다.

class ThisA {
	private int num;
	
	public ThisA(ThisA a) {
		this.num = a.num;
		// 메서드 자체가 이미 생성자이므로 변도의 new ThisA()는 필요하지 않고
		// 멤버변수 값만 복사합니다.
	}
	
	public ThisA() {
	} // 생성자가 만들어지면서 디폴트 생성자가 대체 되었습니다.
	// 다른 곳에서 호출하던 디폴트 생성자가 없어지면서 에러를 발생할 수 있으니
	// 간단하게 디폴트 생성자를 오버로딩 해줍니다.

	public void init(int n /*, ThisA this */) {
		this.num = n;
	}
	
	public void print( /* ThisA this */ ) {
		System.out.printf("멤버변수 num의 값 : %d\n", this.num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void copy1(ThisA a) {
		this.num = a.num;
	}

	public ThisA copy2( /* ThisA this */ ) {  // a3 -> this
		ThisA a = new ThisA(); // 새로운 객체 생성
		a.num = this.num; // 전달된 a3의 this.num 값을 새 객체의 a.num에 복사
		return a; // 완성된 복사본의 참조 값을 리턴
	}
	
}

public class Class18 {

	public static void main(String[] args) {
		
		ThisA t1 = new ThisA();
		t1.init(100);
		t1.print();
		
		ThisA t2 = new ThisA();
		t2.init(200);
		t2.print();
		
		ThisA a3 = new ThisA();
		ThisA a4 = new ThisA();
		
		a3.setNum(300); // a3 -> this     300->매개변수num
		a4.setNum(400); // a4 -> this     400->매개변수num
		
		System.out.printf("a3의 멤버변수 num : %d\n", a3.getNum()); // a3 -> this
		System.out.printf("a4의 멤버변수 num : %d\n", a4.getNum()); // a4 -> this
		
		ThisA a5 = a3;
		a3.setNum(500);
		a5.print();
		a3.print();
		
		ThisA a6 = new ThisA();
		a6.copy1(a4); // 공간할당(new ThisA())이 된 상태에서 멤버변수 값만 카피
		a4.setNum(600);
		a6.print();
		a4.print();
		
		ThisA a7 = a3.copy2(); // 새로운 공간 생성 후 멤버변수 값을 카피하고 그 객체의 참조 값을 리턴
		a3.setNum(800);
		a7.print();
		a3.print();
		
		ThisA a8 = new ThisA(a7);
		
	}

}
