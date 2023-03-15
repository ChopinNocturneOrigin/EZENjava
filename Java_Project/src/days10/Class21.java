package days10;

class Student2 {
	private int number;
	private String name;
	private int[] scores;
	private int tot;
	private double avg;
	private char grade;

	public Student2() {
		scores = new int[4];
		System.out.println("생성자1 호출");
	}

	public Student2(String name) {
		// scores = new int[4];
		this();
		this.name = name;
		System.out.println("생성자2 호출");
	}

	public Student2(String name, int kor, int eng, int mat) {
		// scores = new int[4];
		this(name);
		scores[0] = kor;
		scores[1] = eng;
		scores[2] = mat;
		System.out.println("생성자3 호출");
	}
	// 생성자 안에서 사용되는 this()는 다른 명령보다 항상 위에 있어야 합니다.
}

public class Class21 {

	public static void main(String[] args) {
		
		Student2 std1 = new Student2();
		System.out.println();
		Student2 std2 = new Student2("홍길동");
		System.out.println();
		Student2 std3 = new Student2("홍길남", 98, 87, 89);

	}

}
