package days04;

import java.util.Scanner;

public class ControllOpFor08 {

	public static void main(String[] args) {
		// 1월 1일부터 입력한 날짜까지 몇일이 지났는지 모두 계산합니다.
		// 계산된 날짜를 7로 나눈 나머지를 구해서
		// 1월 1일이 일요일이었으므로 그 나머지에 해당하는 상대적 요일을 출력
		
		// 요일을 계산할 년, 월과 일을 입력 받습니다.
		// 2023년 입력시
		// 365 x 2022 + (1년부터 2022년까지 있었던 윤년의 횟수)
		Scanner scannerInput = new Scanner(System.in);
		System.out.print("년 입력 : ");
		int year = scannerInput.nextInt();
		System.out.print("월 입력 : ");
		int month = scannerInput.nextInt();
		System.out.print("일 입력 : ");
		int day = scannerInput.nextInt();
		int sumDays;
		int chkWeek;
		boolean chkError = false;

		scannerInput.close();
		
		int[] dayOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		if (year < 1 || (month < 1 || month > 12) || (day < 1 || day > dayOfMonth[month])) chkError = true;

		if (!chkError) {
			sumDays = 365 * (year - 1);
			
			// 윤년체크
			for (int i = 1; i < year; i++)
				if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) sumDays++;
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) dayOfMonth[2]++;

			for(int i = 0; i < month; i++) sumDays += dayOfMonth[i];
			
			sumDays += day;
			chkWeek = sumDays % 7;
			
			System.out.printf("%d년 %d월 %d일은 %s요일 입니다.", year, month, day, week[chkWeek]);
		} else System.out.printf("%d년 %d월 %d일은 입력오류 입니다.", year, month, day);
		

	}

}
