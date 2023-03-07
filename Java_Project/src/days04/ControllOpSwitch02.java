package days04;

import java.util.Scanner;

public class ControllOpSwitch02 {

	public static void main(String[] args) {
		Scanner scannerInput = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = scannerInput.nextInt();
		System.out.print("일 입력 : ");
		int days = scannerInput.nextInt();
		int sumDays = 0;
		int chkWeek;
		boolean chkError = false;
		
		int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		if ((month < 1 || month > 12) || (days < 1 || days > daysOfMonth[month])) chkError = true;

		if (!chkError) {
			switch(month) {
			case 12: sumDays += 30; 
			case 11: sumDays += 31; 
			case 10: sumDays += 30; 
			case 9: sumDays += 31; 
			case 8: sumDays += 31; 
			case 7: sumDays += 30; 
			case 6: sumDays += 31; 
			case 5: sumDays += 30; 
			case 4: sumDays += 31; 
			case 3: sumDays += 28; 
			case 2: sumDays += 31; 
			}
			
			sumDays += days;
			chkWeek = (sumDays - 1) % 7;
			
			System.out.printf("%d월 %d일은 %s요일 입니다.", month, days, week[chkWeek]);
		} else System.out.printf("%d월 %d일은 입력오류 입니다.", month, days);
		
		scannerInput.close();

	}

}
