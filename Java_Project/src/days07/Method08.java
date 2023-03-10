package days07;

import java.util.Arrays;
import java.util.Scanner;

public class Method08 {

	public static void main(String[] args) {

		int[] a = {50, 60, 80, 70, 20, 10, 60, 120, 64, 150};
		int inputNumber, tempInputInt = 0;
		boolean loopFlag;
		Scanner sc = new Scanner(System.in);
		
		do {
			loopFlag = false;
			try {
				System.out.print("메뉴를 선택하세요\n(합계:1, 평균:2, 오름차순정렬:3, 내일차순정렬:4) : ");
				tempInputInt = sc.nextInt();
				if (tempInputInt < 1 || tempInputInt > 4)
					loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			}
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);
		inputNumber = tempInputInt;
		
		switch(inputNumber) {
		case 1 :
			printSum(a);
			break;
		case 2 :
			printAvg(a);
			break;
		case 3 :
			printSort(1, a);
			break;
		case 4 :
			printSort(2, a);
		}

		sc.close();

	}
	public static void printSum(int[] a) {
		int sum = 0;
		for (int i : a) sum += i;
		System.out.printf("합계 : %d\n", sum);
	}

	public static void printAvg(int[] a) {
		int sum = 0;
		for (int i : a) sum += i;
		System.out.printf("평균 : %.1f\n", (double)sum / a.length);
	}

	public static void printSort(int n, int[] a) {
		int swapTemp;
		for (int i = 0; i < a.length - 1 ; i++)
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] > a [j] && n == 1) || (a[i] < a [j] && n == 2)) {
					swapTemp = a[j];
					a[j] = a[i];
					a[i] = swapTemp;
				}
			}
		System.out.println(Arrays.toString(a));
	}
	
}
