package days10;

class Student3 {
	private int number;
	private String name;
	private int[] scores;
	static int count = 0;
	
	public Student3() {
		scores = new int[4];
		count++;
		number = count;
	}
	
	public Student3(String name) {
		this();
		this.name = name;
		// this 키워드의 첫쨰 용도와 두번째 용도가 모두 사용
	}
	
	public Student3(String name, int kor, int eng, int mat) {
		this(name);
		scores[0] = kor;
		scores[1] = eng;
		scores[2] = mat;
	}
	
}

public class Class24 {

	public static void main(String[] args) {
		
		Student3 s1 = new Student3();
		Student3 s2 = new Student3("홍길서");
		Student3 s3 = new Student3("홍길동", 56, 99, 55);

	}

}
