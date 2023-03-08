package days05;

public class ControllOpFor15 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++)
				System.out.printf("$");
			System.out.println();
		}
		
		System.out.println("//------------------------------------------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++)
				System.out.printf("$");
			System.out.println();
		}

		System.out.println("//------------------------------------------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++)
				System.out.printf( (j >= i) ? "$" : " " );
			System.out.println();
		}

		System.out.println("//------------------------------------------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= (11 - i); j++)
				System.out.printf("$");
			System.out.println();
		}
		
		System.out.println("//------------------------------------------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++)
				System.out.printf( (j > (10 - i)) ? "$" : " " );
			System.out.println();
		}

		System.out.println("//------------------------------------------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 9 + i; j++)
				System.out.printf(j > 10 - i ? "$" : " ");
			System.out.println();
		}
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= 9 + i; j++)
				System.out.printf(j > 10 - i ? "$" : " ");
			System.out.println();
		}
/*
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 19 - i; j++)
				System.out.printf(j > i ? "$" : " ");
			System.out.println();
		}
*/		
	}

}
