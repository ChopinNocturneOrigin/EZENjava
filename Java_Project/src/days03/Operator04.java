package days03;

public class Operator04 {

	public static void main(String[] args) {
		// 논리 연산자 &&(AND), ||(OR), !(NOT)
		// 둘이상의 관계(비교) 연산식 결과(true/false)값 또는 boolean 값을 연산하여 하나의 boolean 값을 결과로 언는 연산
		// 피연산자 : boolean, 연산의 결과 : boolean
		
		// && : 두항이 모두 true 이어야 결과가 true, 둘중 하나가 false 이면 결과는 false 입니다.
		// || : 두항이 모두 false 이어야 결과가 false, 둘중 하나가 true 이면 결과는 true 입니다.
		// ! : 단항연산 - 피연산자의 true/false 값을 반대로 바꾸는 연산
		
		boolean b1;
		b1 = true && false;
		System.out.printf("%b && %b -> %b\n", true, false, b1);
		
		int a = 80;
		boolean b2 = a > 50;
		boolean b3 = a <= 100;
		
		b1 = b2 && b3;
		System.out.printf("%b && %b -> %b\n", b2, b3, b1);
		b1 = (a > 50) && (a <= 100); // 50 < a <= 100  X
		System.out.printf("a>50 이면서 a<100\n", b1);
		
		// a 변수의 값이 70보다 크거나 40보다 작으면 true 아니면 false 출력
		b1 = (a > 70) || (a < 40);
		System.out.printf("70 > a 이거나 a < 40 : %b\n", b1);
		
		a = 50;
		b1 = (a > 70) || (a < 40);
		System.out.printf("70 > a 이거나 a < 40 : %b\n", b1);
		
		// AND 연산자 (&&)
		// 좌항과 우항의 관계(비교)식 결과 또는 boolean 값이 모두 true인 경우 true가 결과 값
		// 좌항과 우항 중 하나라도 false인 경우 false가 결과 값
		// 좌항의 비교연산 결과가 false인 경우 우항의 식을 비교하지 않습니다.
		System.out.printf("F && F = %b\n", false && false);
		System.out.printf("T && F = %b\n", true && false);
		System.out.printf("F && T = %b\n", false && true);
		System.out.printf("T && T = %b\n", true && true);
		
		// OR 연산자 (||)
		// 좌항과 우항의 관계(비교)식 결과 또는 boolean 값이 하나라도 true인 경우 true가 결과 값
		// 좌항과 우항 모두 false인 경우 false가 결과 값
		// 좌항의 비교연산 결과가 true인 경우 우항의 식을 비교하지 않습니다.
		System.out.printf("F || F = %b\n", false || false);
		System.out.printf("T || F = %b\n", true || false);
		System.out.printf("F || T = %b\n", false || true);
		System.out.printf("T || T = %b\n", true || true);
		
		// NOT 연산자 (!)
		// 단항 연산자, 피연산자의 논리 값의 반대 값이 결과 값
		// false -> true, true -> false
		b1 = false;
		System.out.printf("!%b = %b\n", b1, !b1);
		System.out.printf("!%b = %b\n", true, !true);
		
		// 점수가 80점 이상이면서 90이하이면 true, 아니면 false 출력
		int number = 85;
		boolean result = (number >= 80) && (number <= 90);
		System.out.printf("80이상 그리고 90이하 : result = %b\n", result);
		
		// 점수가 100점 이상이거나 50미만이면 true, 아니면 false 출력
		number = 150;
		result = (number >= 100) && (number < 50);
		System.out.printf("100이상 또는 50미만 : result = %b\n", result);
		
		System.out.println("\n");
		
		int kor = 35, eng = 98, mat = 95, sum;
		double avg;
		boolean bResult;
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.printf("국:%d, 영:%d, 수:%d, 평균:%.1f\n", kor, eng, mat, avg);
		// 평균이 80이상 이면서 영어 점수가 75점 이상이고, 국어 점수가 80이상이면 true 출력 아니면 false 출력
		bResult = (avg >= 80) && (eng >= 75) && (kor >= 80);
		System.out.println("평균이 80이상 이면서 영어 점수가 75점 이상이고, 국어 점수가 80이상이면 true 출력 아니면 false 출력");
		System.out.printf("result1 : %b\n", bResult);
		
		// 국어 : 50이상, 영어 : 60이상, 수학 : 70이상이면 true 아니면 false 출력
		bResult = (kor >= 50) && (eng >= 60) && (mat >= 70);
		System.out.println("국어 : 50이상, 영어 : 60이상, 수학 : 70이상이면 true 아니면 false 출력");
		System.out.printf("result2 : %b\n", bResult);
		
		// 세과목 중 한과목이라 40미만이라면 true, 모두 40이상 false 출력
		bResult = (kor < 40) || (eng < 40) || (mat < 40);
		System.out.println("세과목 중 한과목이라 40미만이라면 true, 모두 40이상 false 출력");
		System.out.printf("result3 : %b\n", bResult);
		
		// 평균 60이상 모든 과목 40이상이라면 true 아니면 false 출력
		bResult = (avg >= 60) && (kor >= 40) && (eng >= 40) && (mat >= 40);
		System.out.println("평균 60이상 모든 과목 40이상이라면 true 아니면 false 출력");
		System.out.printf("result4 : %b\n",bResult);
		
		// 평균 60미만 이거나 한 과목이라도 40미만이라면 true 아니면 false 출력
		bResult = (avg < 60) || (kor < 40) || (eng < 40) || (mat < 40);
		System.out.println("평균 60미만 이거나 한 과목이라도 40미만이라면 true 아니면 false 출력");
		System.out.printf("result5 : %b\n",bResult);
		
		// 평균 70이상 이거나 영어와 수학이 모두 80이상이면 true 아니면 false 출력 (AND 와 OR의 혼합 연산)
		bResult = (avg >= 70) || ((eng >= 80) && (mat >= 80));
		System.out.println("평균 70이상 이거나 영어와 수학이 모두 80이상이면 true 아니면 false 출력");
		System.out.printf("result6 : %b\n",bResult);
		
		// 국어 점수가 짝수라면 true, 홀수라면 false
		bResult = ((kor % 2) == 0);
		System.out.printf("국어 점수가 짝수라면 true, 홀수라면 false : %b\n",bResult);
		
		// 연산의 우선순위
		// 1. () 괄호
		// 2. 피연산자 앞에 있는 ++, --
		// 3. 곱셉, 나눗셈, 나머지
		// 4. 덧셈, 뺄셈
		// 5. 관계연산, 논리연산
		// 6. =
		
		// year변수에 저장된 년도가 윤년이면 true, 평년이면 false를 출력
		int year1 = 2020, year2 = 2022;
		// 윤년의 조건
		// 해당 년도가 4의 배수 이면서 100의 배수가 아니거나, 400의 배수인 해
		bResult = ((year1 % 4 == 0) && (year1 % 100 != 0)) || (year1 % 400 == 0);
		System.out.printf("2020년은 윤년? %b\n", bResult);
		bResult = ((year2 % 4 == 0) && (year2 % 100 != 0)) || (year2 % 400 == 0);
		// bResult = ((year2 % 4 == 0) && !(year2 % 100 == 0)) || (year2 % 400 == 0);
		System.out.printf("2022년은 윤년? %b\n", bResult);

	}

}
