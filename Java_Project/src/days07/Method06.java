package days07;

public class Method06 {

	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 40, d = 30;
		printMaxValue1(a, b, c, d);
		
		int[] e = {50, 60, 80, 70, 20, 10, 60, 120, 64, 150};
		printMaxValue2(e); // 전달인자로 배열의 참조값(주소값)을 전달

	}
	
	public static void printMaxValue1(int a, int b, int c, int d) {
		int max;
		max = (a > b) ? a : b;
		max = (c > max) ? c : max;
		max = (d > max) ? d : max;
		System.out.println("최대값 : " + max);
	}
	
	// 전달인자로 참조값을 전달해서 하나의 배열을 두개의 method가 공유해서 사용
	// Call by reference 라고 부릅니다.
	// 이렇게 전달되는 배열은 배열의 요소가 몇개여도 갯수에 상관없이 전달이 가능합니다.
	public static void printMaxValue2(int[] f) {
		int max = f[0];
		for (int i : f) max = (i > max) ? i : max;
		System.out.println("최대값 : " + max);
	}

}
