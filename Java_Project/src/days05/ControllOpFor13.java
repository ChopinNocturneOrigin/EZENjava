package days05;

public class ControllOpFor13 {

	public static void main(String[] args) {
		
		// 이중 반복문
		// 반복 실행문 둘이 중첩되어 실행되는 구조
		int i, j; // 반복 실행제어를 위한 변수도 별도로 두개가 필요합니다.
		
		for (i = 1; i < 10; i++) {
			for (j = 1; j <= 10; j++)
				System.out.printf("%d x %d = %2d\t", j, i, i*j);
			System.out.println();
		}

	}

}
