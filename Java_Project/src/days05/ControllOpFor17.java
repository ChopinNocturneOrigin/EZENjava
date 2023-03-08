package days05;

import java.util.Scanner;

public class ControllOpFor17 {

	public static void main(String[] args) {

		Scanner scannerInput = new Scanner(System.in);
		System.out.print("년 입력 : ");
		int year = scannerInput.nextInt();
		System.out.print("월 입력 : ");
		int month = scannerInput.nextInt();
		int day = 1;
		int sumDays;
		int chkWeek;
		boolean chkError = false;

		scannerInput.close();
		
		int[] dayOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		if (year < 1 || (month < 1 || month > 12)) chkError = true;

		if (!chkError) {
			sumDays = 365 * (year - 1);
			
			// 윤년체크
			for (int i = 1; i < year; i++)
				if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) sumDays++;
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) dayOfMonth[2]++;

			for(int i = 0; i < month; i++) sumDays += dayOfMonth[i];
			
			sumDays += day;
			chkWeek = sumDays % 7;
			
			System.out.printf("\t\t   %4d년 %2d월\n", year, month);
			System.out.println("--------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("--------------------------------------------------");
			
			for (int i = 0; i < chkWeek; i++) System.out.print("\t");
			for (int i = 1; i <= dayOfMonth[month]; i++) {
				System.out.printf("%2d\t", i);
				if ((i + chkWeek) % 7 == 0) System.out.println();
			}
			System.out.println("\n--------------------------------------------------");
			
		} else System.out.printf("%d년 %d월은 입력오류 입니다.", year, month);

	}

}
