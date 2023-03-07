package days04;

import java.util.Scanner;

public class ControllOpIF10 {

	public static void main(String[] args) {
		// 2023년에 한해서 월과 일을 입력 받고 그 날짜에 해당하는 요일을 출력합니다.
		
		// 1월 1일부터 입력한 날짜까지 몇일이 지났는지 모두 계산합니다.
		// 계산된 날짜를 7로 나눈 나머지를 구해서
		// 1월 1일이 일요일이었으므로 그 나머지에 해당하는 상대적 요일을 출력
		
		// 1. 요일을 계산할 월과 일을 입력 받습니다.
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
			for(int i=0;i<month;i++) sumDays += daysOfMonth[i];
			
			sumDays += days;
			chkWeek = (sumDays - 1) % 7;
			
			System.out.printf("%d월 %d일은 %s요일 입니다.", month, days, week[chkWeek]);
		} else System.out.printf("%d월 %d일은 입력오류 입니다.", month, days);
		
		scannerInput.close();
		
		// 변수를 초기화 하지 않고 if의 경우의 수에 따라 변수를 사용하면
		// 각 경우의 수에 맞지 않는 경우 변수 값이 여전히 초기화 되지 않으므로
		// else를 써서 변수 값이 대입될 경우의 수를 만들어 줍니다.
		// 그렇지 않다면 변수 선언시 값을 넣어주는 방법을 쓸 수도 있습니다.

	}

}
