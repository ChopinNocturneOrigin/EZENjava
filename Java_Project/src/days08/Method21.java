package days08;

import java.util.Scanner;

public class Method21 {

	public static void main(String[] args) {
		
		int year = 0, month = 0;
		boolean chkError = true, chkFin = true;
		int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		Scanner sc = new Scanner(System.in);

		year = inputYear(sc);
		month = inputMonth(sc);
		
		while (chkFin) {
			
			printCalendar(year, month, daysOfMonth);
				
			int consoleInputNumber;
			do {
				chkError = false;
				System.out.print("[1.이전달]\t[2.다음달]\t[3.종료] : ");
				try {
					consoleInputNumber = sc.nextInt();
				} catch (Exception e) {
					System.err.println("입력오류 입니다.");
					sc.nextLine();
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
		
		sc.close();

	}
	
	public static void printCalendar(int year, int month, int[] daysOfMonth) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) daysOfMonth[2] = 29;
		else daysOfMonth[2] = 28;
		int sumDays = calcSumDays(year, month, daysOfMonth);
		int chkWeek = sumDays % 7;
		
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
	}

	public static int calcSumDays(int year, int month, int[] daysOfMonth) {
		int sumDays;
		
		sumDays = 365 * (year - 1);
		for (int i = 1; i < year; i++)
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) sumDays++;
		for(int i = 0; i < month; i++) sumDays += daysOfMonth[i];
		
		return ++sumDays;
	}

	public static int inputYear(Scanner sc) {
		int tempInputInt = 0;
		boolean loopFlag;
		do {
			loopFlag = false;
			try {
				System.out.print("년 입력 (1 ~ ) : ");
				tempInputInt = sc.nextInt();
				if (tempInputInt < 1) loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			} 
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);
		return tempInputInt;
	}

	public static int inputMonth(Scanner sc) {
		int tempInputInt = 0;
		boolean loopFlag;
		do {
			loopFlag = false;
			try {
				System.out.print("월 입력 (1 ~ 12) : ");
				tempInputInt = sc.nextInt();
				if (tempInputInt < 1 || tempInputInt > 12) loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			} 
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);
		return tempInputInt;
	}
	
}
