package days05;

public class ControllOpFor14 {

	public static void main(String[] args) {
		// 1. 구구단 1단부터 10단까지를 출력하세요
		int i, j;
		
		for (i = 1; i < 10; i++) {
			for (j = 1; j <= 10; j++)
				System.out.printf("%d x %d = %2d\t", j, i, i*j);
			System.out.println();
		}

		System.out.println();
		
		// 2. 구구단 2단부터 9단까지를 출력하세요
		for (i = 1; i < 10; i++) {
			for (j = 2; j < 10; j++)
				System.out.printf("%d x %d = %2d\t", j, i, i*j);
			System.out.println();
		}

		System.out.println();
		
		// 3. 2 ~ 5 단은 상단에 6 ~ 9 단은 하단에 위치
		for (i = 1; i < 10; i++) {
			for (j = 2; j < 6; j++)
				System.out.printf("%d x %d = %2d\t", j, i, i*j);
			System.out.println();
		}
		System.out.println();
		for (i = 1; i < 10; i++) {
			for (j = 6; j < 10; j++)
				System.out.printf("%d x %d = %2d\t", j, i, i*j);
			System.out.println();
		}
	}

}
