package days10;

// int형 자료를 매개변수로하는 생성자와 디폴트 생성자를 오버로딩하는 클래스 생성
// 전달인자가 있으면 전달인자를 멤버변수 dan에 저장, 전달인자가 없으면 dan에 0 저장
// 멤버변수는 int dan; 한개만 생성
// 멤버메서드는 print() 하나
// print 메서드의 내용
// dan 이 0이 아니면 해당 구구단 출력
// dan 이 0이면 2 ~ 9단 모두 출력

class Gugudan {
	int dan;
	
	public Gugudan(int i) {
		dan = i;
	}

	public Gugudan() {
		dan = 0;
	}

	public void print() {
		if (this.dan != 0) {
			for(int i = 1; i < 10 ; i++) 
				System.out.printf("%d x %d = %2d\n", this.dan, i, this.dan * i);
			System.out.println();
		} else {
			for(int i = 1; i < 10 ; i++) {
				for(int j = 2; j < 6 ; j++)
					System.out.printf("%d x %d = %2d\t", j, i, i * j);
				System.out.println();
			}
			System.out.println();
			for(int i = 1; i < 10 ; i++) {
				for(int j = 6; j < 10 ; j++)
					System.out.printf("%d x %d = %2d\t", j, i, i * j);
				System.out.println();
			}
		}
	}

}

public class Class17 {

	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(8);
		Gugudan g2 = new Gugudan();
		g1.print();
		g2.print();
		

	}

}
