package days04;

import java.util.Scanner;

public class ControllOpFor09 {

	public static void main(String[] args) {
		// 10개의 정수를 입력 받아 그들의 합계와 평균을 출력하세요.
		// 10개를 입력하는 중간에 종료를 원하면 0을 입력하여 입력을 종료하고
		// 최종 합계를 출력 합니다.
		
		// 입력양식
		// 입력 1: xx
		// 입력 2: xx
		// 입력 3: xx
		// ...
		// 입력10: xx

		// 출력양식
		// 입력한 정수들의 합계 : xxx
		// 입력한 정수들의 평균 : xx.x
		
		// 중간에 0을 입력하면 입력이 종료되고 그 동안 입력한 데이터 만으로 합계 평균을 출력하세요.
		
		int sum = 0, i, num;
		double avg;
		Scanner sc = null;
		
		for (i = 0; i < 10; i++) {
			sc = new Scanner(System.in);
			System.out.printf("입력%2d: ", i + 1);
			num = sc.nextInt();
			// 반복실행 속에 입력 명령이 있다면, 다음 입력으로 현재 입력이 사라질 수 있습니다.
			sum += num;
			if (num == 0) break; // 반복실행은 break로 정해진 횟수를 다 채우지 않고 멈출 수 있습니다.
		}
		if (i != 0) avg = (double)sum / i;
		else avg = 0;
		
		System.out.printf("입력한 정수들의 합계 : %d\n", sum);
		System.out.printf("입력한 정수들의 평균 : %.1f\n", avg);
	}

}
