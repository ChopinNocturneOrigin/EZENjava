package days02;

public class Operator01 {

	public static void main(String[] args) {
		// 연산자
		
		// 산술연산자 - 사칙연산자(오칙연산자) : +, -, *, /, %(modular)
		// 관계연산자 - 비교연산자 : >, <, >=, <=, ==, !=
		// 논리연산자 : &&(and), ||(or), !(not)
		
		int n1 = 10, n2 = 7, result1;
		double result2;
		
		result1 = n1 + n2;
		System.out.printf("%d + %d = %d\n", n1, n2, result1);
		result1 = n1 - n2;
		System.out.printf("%d - %d = %d\n", n1, n2, result1);
		result1 = n1 * n2;
		System.out.printf("%d x %d = %d\n", n1, n2, result1);
		result2 = (double)n1 / n2;
		System.out.printf("%d ÷ %d = %.2f\n", n1, n2, result2);
		result1 = n1 % n2;
		System.out.printf("%d mod %d = %d\n", n1, n2, result1);
		
		int n = 50;
		// 피연산자로 쓰인 변수와 연산의 결과를 저장할 변수가 같은 연산
		System.out.printf("\nint n = %d\n", n);
		n += 10; // n = n + 10
		System.out.println("n += 10");
		System.out.printf("n = %d\n",n);
		// 1. 현재 n값(50)과 두번째 피연산자인 10이 CPU로 전달되어 덧셉됩니다.
		// 2. 연산 결과가 돌아와서 다시 n변수에 저장됩니다.
		// 연산에 참여했던 n값 50은 사라지고, 연산의 결과인 60이 n변수에 남습니다.
		// 간략하게 다음과 같이도 사용합니다. n += 10;
		
		n -= 10; // n = n - 10
		System.out.println("n = n - 10 -> n : " + n);
		n *= 10; // n = n * 10
		System.out.println("n = n * 10 -> n : " + n);
		n %= 7; // n = n % 10
		System.out.println("n = n % 7 -> n : " + n);

		double d = 50.0;
		System.out.println("d의 최초값 : " + d);
		d /= 10.0; // d = d / 10.0
		System.out.println("d = d / 10 -> d : " + d);
		System.out.println();
		
		// n++; ++n; n = n + 1;
		// n--; --n; n = n - 1;
		// 특정 변수의 값을 1 증가하거나, 감소 시킬 수 있는 연산자
		// 대입 연산자(=)를 사용하지 않고 값을 변경합니다.
		
		n = 50;
		System.out.println("n -> " + n);
		n++;
		System.out.println("n++ -> " + n);
		++n;
		System.out.println("++n -> " + n);
		// 위와 같은 단항 연산일때는 ++나 --를 앞 또는 뒤에 어느곳에 붙여도 같은 결과가 나옵니다.
		
		// ++, -- 연산이 앞 또는 뒤에 있을때 차이가 나는 경우는 다른 연산과 섞여 있을때 차이가 생깁니다.
		n = 10;
		System.out.println("\nn -> " + n);
		
		int k = n++;
		System.out.println("int k = n++;");
		System.out.println("k -> " + k + ", n -> " + n);

		n = 10;
		System.out.println("\nn -> " + n);
		
		k = ++n;
		System.out.println("int k = ++n;");
		System.out.println("k -> " + k + ", n -> " + n);

	}

}
