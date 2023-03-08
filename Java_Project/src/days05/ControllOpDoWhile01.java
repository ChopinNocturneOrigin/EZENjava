package days05;

import java.util.Scanner;

public class ControllOpDoWhile01 {

	public static void main(String[] args) {
		int i;
		for (i = 11; i <= 10; i++) 
			System.out.printf("%d ", i);
		System.out.printf("\nfor 반복 종료 후 i 변수 값 : %d\n", i);
		System.out.println("-------------------------------");
		
		i = 11;
		while ( i <= 10 )
			System.out.printf("%d ", i++);
		System.out.printf("\nwhile 반복 종료 후 i 변수 값 : %d\n", i);
		System.out.println("---------------------------------");
		
		i = 11;
		do
			System.out.printf("%d ", i++);
		while ( i <= 10 );
		System.out.printf("\ndo-while 반복 종료 후 i 변수 값 : %d\n", i);
		System.out.println("------------------------------------");
		// do while 의 특이점 while (조건) 을 후미에 기술 합니다.
		// while (조건) 뒤에 ';(semi-colon)'을 찍습니다.
		// if () ;  X
		// for (;;);  X
		// do {} while ();  O
		// do에 속한 {} 안의 명령을 한번 먼저 실행 후 조건을 테스트 합니다.
		
		// do-while 반복문을 활용하여
		// 사용자가 100을 입력 할때까지 반복해서 입력받고 최종 합계를 출력하세요.
		int inputNumber, sum = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("정수를 입력 (종료:100) : ");
			inputNumber = sc.nextInt();
			sum += inputNumber;
		} while (inputNumber != 100);
		sum -= 100;
		System.out.printf("입력한 정수의 합 : %d", sum);
		
		sc.close();

	}

}
