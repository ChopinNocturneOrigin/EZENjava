package days02;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 35 + 38 = 73
		System.out.println(35 + "+" + 38 + "=" + (35+38));
		System.out.println(35 + "-" + 38 + "=" + (35-38));
		System.out.println(35 + "x" + 38 + "=" + (35*38));
		System.out.println(35 + "÷" + 38 + "=" + (35/38.0));
		System.out.println(35 + "%" + 38 + "=" + (35%38));
		
		// 변수(Variables) : 프로그램 실행 중 발생 또는 입력되는 데이터를 저장할 목적으로 만든 임시 저장장소
		// 프로그램 생성명령 실행시 생성되고, 프로그램 종료시 소멸됩니다.

		int a;	// a라는 이름의 변수를 생성 (정수를 저장하기 위한 변수)
		// int : 정수형 자료 하나를 저장할 공간을 생성하는 명령
		// a : 생선된 변수의 이름을 프로그램 내에서 a라고 부르기 위해 지은 이름
		int b;
		int plusResult, minusResult, multiplyResult; // 한번에 여러변수를 생성 (정수를 저장하기 위한 변수)
		double divideResult; // divideResult 라는 이름의 변수 생성 (실수를 저장 할 변수)
		
		// 변수의 이름을 만드는 규칙
		// 1. 인터넷 사이트의 회원 가입시 만드는 아이디 이름 규칙과 비슷합니다.
		// 2. 영문과 숫자, 그리고 일부 특수문자(_) 섞어서 사용가능 하지만
		// 3. 첫글자 반드시 영문으로 사용합니다.
		// 4. 중간에 공백이 있을 수 없습니다.
		// 5. 너무 짧지 않게 약간의 의미를 부여해서 이름을 생성하는 편입니다.
		// 6. 변수의 이름이 너무 짧으면, 변수의 갯수가 많아 졌을때 서로의 용도를 구분하기 어렵습니다.
		// 7. 변수의 이름이 너무 길면, 사용 할때마다 그 긴 이름을 타이핑 해야하는 불편함이 있습니다.
		// 8. 두가지 의미의 단어가 조합되어 변수의 이름이 만들어 진다면 첫단어는 소문자로, 두번째 단어 첫을자 때문자로 생성합니다.
		// e.g.) 덧셈의 결과를 저장할 변수 이름 : plusResult (Camel case)
		// 9. 변수는 자료형(정수, 실수, 문자)에 따라 만드는 명령이 달라집니다.
		// int : 정수, double : 실수, String : 문자 등
		// int a; // 정수형 변수 a가 생성
		// double b; // 실수형 변수 b
		// String c; // 문자형 변수 c
		
		a = 10;
		b = 11;
		// 이 명령이 실행된 이후로 a변수에는 10이 보관됩니다. 다른 값이 a변수에 다시 저장되거나 프로그램이 끝날떄까지
		
		// b = 10.213; // 실수 -> 정수형 변수에 저장하면 데이터 손실을 유발하므로 에러
		divideResult = 100; // 정수 -> 실수형 변수에 저장하는 것은 데이터 손실이 없으므로 정상 실행
		
		boolean b1; // 참(true) 또는 거짓(false) 중 하나를 저장하는 변수
		b1 = true; // 또는 false를 저장할 수 있다.
		
		System.out.printf("변수 b1의 값 : %b\n", b1);
		System.out.println("변수 b1의 값 : " + b1);
		// boolean 자료를 printf로 출력할 때 %b를 사용합니다.
		
		// int		- 정수형 자료형 4byte형 정수
		// long		- 정수형 자료형 8byte형 정수
		// float	- 실수형 자료형 4byte형 실수
		// double	- 실수형 자료형 8byte형 실수
		// char		- 문자(글자) 자료형 '', 'a', 'b'	2byte - String과 다릅니다.
		// String	- 문자열 자료형 "", "a", "abc" 0글자에서 글자 갯수 제한 없이 저장할 수 있는 자료형
		// String은 현재는 자료형이라 부르지만 엄밀히 자료형이라기 보다 클래스(객체)라고 부르는 것이 정확한 표현입니다.
		
		// 저장용량 단위
		// bit : 1과 0 중 하나를 저장할 수 있는 단위
		// 1bit 는 1과 0 중에 하나를 저장할 수 있다라고 하고, 다른 말로 2가지 정보를 표현할 수 있다.
		// 2^(n-1)개의 정보를 표현
		// 1byte = 8bit - 256개의 정보 0 ~ 255
		// 2byte = 16bit - 65536개의 정보 0 ~ 65535
		// 예전 시스템의 int : 2byte (-32768 ~ 32767)
		// 현재 시스템의 int : 4byte (-2147483648 ~ 2147483647)
		
		// double : 8byte  0.0002 -> 0.2 x 10의 -4승 -> 변수에 2와 -4를 값과 지수로 저장
		
		char c;
		c = 'A';
		System.out.printf("변수 c의 값 : %c\n", c);
		System.out.println("변수 c의 값 : " + c);
		
		String s;
		s = "ABCD";
		System.out.printf("변수 s의 값 : %s\n", s);
		System.out.println("변수 s의 값 : " + s);
		
		a = 16;
		b = 52;
		c = '+'; // 변수에 값을 보관
		
		// plusResult = 16 + 52;
		plusResult = a + b; // 변수를 이용해서 연산을 하고, 결과를 또 다른 변수에 저장
		System.out.printf("%d %c %d = %d\n", a, c, b, plusResult);
		
		c = '-'; // 무언가 보관된 변수에 새로운 값을 다시 넣으면 이전 값은 사라지고 현재 넣은 값이 새롭게 보관됩니다.
		minusResult = a - b;
		System.out.printf("%d %c %d = %d\n", a, c, b, minusResult);

		c = 'x';
		multiplyResult = a * b;
		System.out.printf("%d %c %d = %d\n", a, c, b, multiplyResult);
		
		c = '÷';
		divideResult = (double)a / b;
		System.out.printf("%d %c %d = %.2f\n", a, c, b, divideResult);
		// 정수와 정수의 사칙여산은 결과도 정수입니다.
		// 피연산자를 둘중 하나만 실수이면 연산의 결과는 실수가 됩니다.
		// (double) : 현재 위치에서만 잠시 double형으로 변환. 이 명령이 지나면 다시 int형으로
		
		System.out.println();
		// 위의 네개의 출력을 println으로 바꿔서 출력하세요.
		c = '+';
		System.out.println(a + " " + c + " " + b + " = " + plusResult);
		c = '-';
		System.out.println(a + " " + c + " " + b + " = " + minusResult);
		c = 'x';
		System.out.println(a + " " + c + " " + b + " = " + multiplyResult);
		c = '÷';
		System.out.println(a + " " + c + " " + b + " = " + String.format("%.2f", divideResult));
		System.out.println(a + " " + c + " " + b + " = " + Math.round(divideResult*100)/100.0);
		System.out.println(a + " " + c + " " + b + " = " + Math.ceil(divideResult*100)/100.0);
		System.out.println(a + " " + c + " " + b + " = " + Math.floor(divideResult*100)/100.0);
		System.out.println(a + " " + c + " " + b + " = " + (int)(divideResult*100)/100.0);
		
		// 64.666666666666666
		// 64.666666666666666 * 100  ->  6466.6666666666666
		// (int)6466.6666666666666  ->  6466
		// 6466 / 100.0  ->  64.66
		
		// (int)(64.666666666666666 * 100) / 100.0
		// (int)(divideResult * 100) / 100.0
		
	}

}
