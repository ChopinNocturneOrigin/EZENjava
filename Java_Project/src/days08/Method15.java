package days08;

// Method Overloading
// Method의 이름은 같고, 매개변수의 타입, 갯수, 숫서가 다르면 서로 다른 method로 인지하는 문법
// 일관된 method 이름을 사용하여 사용자에게 직관적인 이름을 사용하게 합니다.
// 전달인자의 자료형, 순서 등이 서로 달라도 가능

public class Method15 {

	public static void main(String[] args) {
		
		int maxValue = max(56, 97, 23);
		System.out.println("56, 97, 23 중 가장 큰 값은 " + maxValue + "입니다.");
		
		maxValue = max(89, 78, 56, 36);
		System.out.println("89, 78, 56, 36 중 가장 큰 값은 " + maxValue + "입니다.");

		maxValue = max(56, 87);
		System.out.println("56, 87 중 가장 큰 값은 " + maxValue + "입니다.");

		double maxValueD = max(123.45, 456.56);
		System.out.println("123.45, 456.56 중 가장 큰 값은 " + maxValueD + "입니다.");

	}
	
	public static int max(int n1, int n2, int n3) {
		int max = (n1 > n2) ? n1 : n2;
		max = (n3 > max) ? n3 : max;
		return max;
	}
	
	public static int max(int n1, int n2, int n3, int n4) {
		int max = (n1 > n2) ? n1 : n2;
		max = (n3 > max) ? n3 : max;
		max = (n4 > max) ? n4 : max;
		return max;
	}

	public static int max(int n1, int n2) {
		return (n1 > n2) ? n1 : n2;
	}
	
	public static double max(double n1, double n2) {
		return (n1 > n2) ? n1 : n2;
	}

}
