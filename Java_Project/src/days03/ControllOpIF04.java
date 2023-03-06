package days03;

public class ControllOpIF04 {

	public static void main(String[] args) {
		
		int a = 85; // 정수 하나를 입력 받은 셈으로 변수생성, 정수 하나 저장 하였습니다.
		
		// 90 이상 A학점, 80 ~ 89 B학점, 70 ~ 79 C학점, 60 ~ 69 D학점, 60미만 F학점
		if (a >= 90) System.out.println("A학점");
		else if (a >=80) System.out.println("B학점");
		else if (a >=70) System.out.println("C학점");
		else if (a >=60) System.out.println("D학점");
		else System.out.println("F학점");
		
		// 잘못 적용한 사례 ------------------------------------------
		if (a < 60) System.out.println("F학점");
		else if (a >=60) System.out.println("D학점");
		else if (a >=70) System.out.println("C학점");
		else if (a >=80) System.out.println("B학점");
		else System.out.println("A학점");
		
		// 올바른 사례 ---------------------------------------------
		if (a < 60) System.out.println("F학점");
		else if (a < 70) System.out.println("D학점");
		else if (a < 80) System.out.println("C학점");
		else if (a < 90) System.out.println("B학점");
		else System.out.println("A학점");

	}

}
