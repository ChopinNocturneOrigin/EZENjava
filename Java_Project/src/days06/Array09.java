package days06;

import java.util.Scanner;

public class Array09 {

	public static void main(String[] args) {
		int year = 0, month = 0, day = 1;
		int sumDays;
		int chkWeek;
		boolean chkError = true, chkFin = true;
		int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		Scanner scannerInput = null;
		scannerInput = new Scanner(System.in);

		while (chkError) {
			try {
				System.out.print("년 입력 (1 ~ ) : ");
				year = scannerInput.nextInt();
				System.out.print("월 입력 (1 ~ 12) : ");
				month = scannerInput.nextInt();
			} catch (Exception e) {
				System.err.println("입력오류 입니다.");
				scannerInput.nextLine();
				continue;
			}
			if (year < 1 || (month < 1 || month > 12)) chkError = true;
			else chkError = false;
			if (chkError) System.err.printf("%d년 %d월은 입력오류 입니다.\n", year, month);
		}

		while (chkFin) {
			sumDays = 365 * (year - 1);
			// 윤년체크
			for (int i = 1; i < year; i++)
				if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) sumDays++;
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) daysOfMonth[2] = 29;
			else daysOfMonth[2] = 28;

			for(int i = 0; i < month; i++) sumDays += daysOfMonth[i];
			
			sumDays += day;
			chkWeek = sumDays % 7;
			
			System.out.printf("\t\t   %4d년 %2d월\n", year, month);
			System.out.println("--------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("--------------------------------------------------");
			
			for (int i = 0; i < chkWeek; i++) System.out.print("\t");
			for (int i = 1; i <= daysOfMonth[month]; i++) {
				System.out.printf("%2d\t", i);
				if ((i + chkWeek) % 7 == 0) System.out.println();
			}
			System.out.println("\n--------------------------------------------------");
				
			int consoleInputNumber;
			do {
				chkError = false;
				System.out.print("[1.이전달]\t[2.다음달]\t[3.종료] : ");
				try {
					consoleInputNumber = scannerInput.nextInt();
				} catch (Exception e) {
					System.err.println("입력오류 입니다.");
					scannerInput.nextLine();
					chkError = true;
					continue;
				}
				if (consoleInputNumber == 1) {
					if (month == 1 && year == 1)
						System.out.println("이전달은 1년 1월까지 지원합니다.");
					else if (month == 1) {
						year--;
						month = 12;
					} 
					else month--;
				} else if (consoleInputNumber == 2) {
					if (month == 12) {
						year++;
						month = 1;
					} else month++;
				} else if (consoleInputNumber == 3) chkFin = false;
				else {
					System.err.print("입력 오류입니다.\n");
					chkError = true;
				}
			} while (chkError);
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
		
		scannerInput.close();

	}

}
