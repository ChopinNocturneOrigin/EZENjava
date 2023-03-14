package days09;

// 같은 패키지 안에서는 클래스 이름이 중복 될 수 없습니다. 그래서 Student 대신 Std라는 이름을 사용합니다.
class Std {
	private int number;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	public void input(int i, String string, int j, int k, int l) {
		number = i;
		name = string;
		kor = j;
		eng = k;
		mat = l;
		tot = kor + eng + mat;
		avg = tot / 3.0;
	}

	public void printScore() {
		System.out.printf("%4d%6s%6d%6d%6d%7d%8.1f\n",
				number,
				name,
				kor,
				eng,
				mat,
				tot,
				avg);
	}
	
	
}

public class Class05 {

	public static void main(String[] args) {
		
		Std s1 = new Std();
		Std s2 = new Std();
		
		s1.input(1, "홍길동", 88, 77, 99); // 전달인자가 각 객체의 맴버변수에 저장되는 메서드 제작
		s2.input(2, "홍길서", 89, 98, 78);
		
		printTitle(true);
		s1.printScore();
		s2.printScore();
		printTitle(false);

	}

	public static void printTitle(boolean checkValue) {
		if (checkValue) {
			System.out.println("\t     --= 성  적  표 =--");
			System.out.println("-----------------------------------------------");
			System.out.println(" 번호  성  명   국어  영어  수학   총점   평균");
		}
		System.out.println("-----------------------------------------------");
	}
	
}
