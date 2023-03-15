package days10;

class Student {
	private int number = 0;
	private String name;
	private int[] scores;
	private double avg;
	
	public Student() {
		this.scores = new int[4];
		// 멤버변수에 참조변수에 존재한다면 생성자에서 메모리 할당 명령이 실행됩니다.
		// number++;
		// 번호는 객체가 생성될때마다 부여되는 연속번호를 입력하는 좋은 방법을 공부하고 넣겠습니다.
		this.name = "홍길동";
		this.scores[0] = 0;
		this.scores[1] = 0;
		this.scores[2] = 0;
	}

	public Student(String name) {
		// number++;
		this.name = name;
		this.scores = new int[4];
		this.scores[0] = 0;
		this.scores[1] = 0;
		this.scores[2] = 0;
	}

	public Student(String name, int kor, int eng, int mat) {
		// number++;
		this.name = name;
		this.scores = new int[4];
		this.scores[0] = kor;
		this.scores[1] = eng;
		this.scores[2] = mat;
	}

	public Student(Student s) {
		this.name = s.name;
		this.scores = new int[4];
		this.scores[0] = s.scores[0];
		this.scores[1] = s.scores[1];
		this.scores[2] = s.scores[2];
	}
	
	public void calcScores(int[] s, int avg) {
		s[4] = s[0] + s[1] + s[2];
		this.avg = s[4] / 3.0;
	}

	public void printTitle(boolean checkValue) {
		if (checkValue) {
			System.out.println("\t     --= 성  적  표 =--");
			System.out.println("-----------------------------------------------");
			System.out.println(" 번호  성  명   국어  영어  수학   총점   평균");
		}
		System.out.println("-----------------------------------------------");
	}
	
	public void printScore() {
		System.out.printf("%4d%6s%6d%6d%6d%7d%8.1f\n",
				number,
				name,
				scores[0],
				scores[1],
				scores[2],
				scores[3],
				avg);
	}

	public void copy1(Student s) {
		this.name = s.name;
		this.scores[0] = s.scores[0];
		this.scores[1] = s.scores[1];
		this.scores[2] = s.scores[2];
	}
}

// 아래 생성자들이 모두 실행 가능하도록 생성자를 제작합니다.
// 모든 생성자에서 scores에 과목점수 정수 세개를 저장할 배열을 만들고 주소를 저장하도록 코딩하세요.
// 디폴트 생성자와 이름만 전달되는 생성자에서 각 점수는 임의의 값을 대입하세요.

public class Class16 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student("홍길서");
		Student s3 = new Student("홍길남", 98, 69, 87);
		Student s4 = new Student(s3);
		
		Student s5 = new Student();
		s5.copy1(s1);

	}

}
