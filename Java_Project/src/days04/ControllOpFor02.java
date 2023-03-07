package days04;

public class ControllOpFor02 {

	public static void main(String[] args) {
		int i;
		// 1부터 100까지의 정수 출력
		System.out.println("1 ~ 100 정수 출력 ----------------------------------------");
		for (i = 1; i < 101 ; i++) System.out.print(i+" ");
		
		System.out.println("\n");

		System.out.println("1 ~ 100 짝수 출력 #1--------------------------------------");
		for (i = 2; i < 101 ; i+=2) System.out.print(i+" ");

		System.out.println("\n");
		
		System.out.println("1 ~ 100 짝수 출력 #2--------------------------------------");
		for (i = 1; i < 101 ; i++) if (i % 2 == 0) System.out.print(i+" ");

		System.out.println("\n");

		System.out.println("1 ~ 100 홀수 출력 #1--------------------------------------");
		for (i = 1; i < 101 ; i+=2) System.out.print(i+" ");

		System.out.println("\n");
		
		System.out.println("1 ~ 100 홀수 출력 #2--------------------------------------");
		for (i = 1; i < 101 ; i++) if (i % 2 == 1) System.out.print(i+" ");

	}

}
