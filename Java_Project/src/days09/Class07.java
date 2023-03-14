package days09;

import java.util.Scanner;

// 멤버 메서드의 역할은 은닉자료의 접근만 있는 것은 아닙니다.
// 멤버자료의 유효한 값의 관리와 가공 및 권한적용, 제어 등을 담당하기도 합니다.

class AccountWithPermission {
	private double balance;
	Scanner sc = new Scanner(System.in);
	
	public void initBalance(int money) {
		balance = money;
		display();
	}
	
	public void withdraw() {
		int money = 0;
		String password;
		try {
			System.out.print("출금할 금액을 입력하세요 : ");
			money = sc.nextInt();
			System.out.print("비밀번호를 입력하세요 : ");
			password = sc.next();
			if (!password.equals("1234")) {
				System.err.println("비밀번호가 맞지 않습니다.");
				return;
			}
			if (money > balance) {
				System.err.println("잔액이 부족합니다.");
				return;
			}
		} catch (Exception e) {
			sc.nextLine();
			System.err.println("입력 오류! 관리자에게 문의하세요.");
			return;
		} 
		balance -= money;
		System.out.printf("%,d원 출금이 완료 되었습니다.\n", money);
		display();
	}
	
	public void display() {
		System.out.printf("현재 잔액은 %,.2f원 입니다.\n", balance);
	}
	
	public void deposit() {
		int money = 0;
		try {
			System.out.print("입금할 금액을 입력하세요 : ");
			money = sc.nextInt();
			if (money < 0) {
				System.err.println("입금액 오류. 관리자에게 문의하세요.");
				return; // void의 return은 되돌림 값 없이 메서드를 종료하라는 뜻 입니다.
			}
		} catch (Exception e) {
			sc.nextLine();
			System.err.println("입력 오류! 관리자에게 문의하세요.");
			return;
		} 
		balance += money;
		System.out.printf("%,d원 입금이 완료 되었습니다.\n", money);
		display();
	}
	
}

public class Class07 {

	public static void main(String[] args) {
		
		AccountWithPermission a = new AccountWithPermission();
		a.initBalance(50000); // 잔액 초기화
		
		Scanner sc = new Scanner(System.in);
		int selectMenu;
		int tempInputInt = 0;
		boolean loopFlag, menuFlag;
		menuFlag = true;
		do {
			do {
				loopFlag = false;
				try {
					System.out.print("메뉴 선택 : 1. 입금, 2. 출금, 3. 잔액확인, 4. 종료 -> ");
					tempInputInt = sc.nextInt();
					if (tempInputInt < 1 || tempInputInt > 4) loopFlag = true;
				} catch (Exception e) {
					loopFlag = true;
					sc.nextLine();
				} 
				if (loopFlag) System.err.println("입력 오류!");
			} while (loopFlag);
			selectMenu = tempInputInt;
			switch (selectMenu) {
			case 1:
				a.deposit();
				break;
			case 2:
				a.withdraw();
				break;
			case 3:
				a.display();
				break;
			case 4:
				menuFlag = false;
			}
		} while (menuFlag);
		
		System.out.println("프로그램이 종료됩니다.");
		
		sc.close();

	}

}
