package days06;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		// 배열
		// 동일한 변수 이름에 번호(첨자)를 붙여서 다수개의 데이터를
		// 효과적으로 한번에 저장 및 다룰 수 있게 하는 저장구조
		// (사용 형태가 약간 다른 다수개의 변수)
		// 1. 다수개의 변수를 같은 이름으로 손쉽게 선언하여 사용가능
		// 2. 하나의 이름으로 다수개의 변수들을 제어할 수 있음
		
		// 배열이 생성방법
		// 자료형[] 배열변수명;
		// int a; // 정수형 변수 선언
		int[] a; // 정수형 배열선언

		// a는 일반 정수형 변수와는 다른 참조(reference)변수 입니다.
		// 참조변수는 메모리(주기억장치:RAM) 내부의 공간중 HEAP이라는 영역 안에 실제 데이터가
		// 저장된 곳을 지정하고 그 곳의 위치정보를 저장하는 변수입니다.
		
		// 참조값 = 레퍼런스값 = 주소값 = 어드레스값
		// 참조변수(레퍼런스변수)는 위 네개의 이름이 지칭하는 그 하나의 값을 저장하는 변수
		// a = 123; // 에러 
		// a변수는 정수를 정하는 변수가 아니고, 정수가 저장된 곳의 주소를 저장하는
		// 변수이기 때문에 일반 정수를 넣으려고 하면 에러가 발생합니다.
		
		// 현재는 배열에 정수를 몇개 저장 할 수 있는지 갯수와 메모리가 정해지지 않았습니다.
		// 배열을 사용하기 전에 저장할 수 있는 갯수와 메모리 주소를 반드시 정해 놓고 사용합니다.
		a = new int[3];	// Heap 영역에 정수 세개를 저장할 공간을 마련하고, 그 시작주소를 a 변수에 저장
		// 세개의 정수가 저장될 공간은 주기억장치 상에 연속공간으로 마련됩니다.
		// new 연산자 : 동적인 메모리를 생성하는 연산자
		//              프로그램의 구동 중에 HEAP 메모리에 공간을 생성하는 연산자로 생성된
		//              메모리의 참조(주소)값을 반환 전달 합니다.
		Scanner sc = new Scanner(System.in);
		// Scanner 자료형의 만큼 Heap에 공간을 마련하고 그 주소를 sc 변수에 저장
		
		// 둘을 합쳐서
		int[] b = new int[3]; // 으로 선언 하기도 합니다.
		
		// 배열의 각 공간에 값을 대입하는 방법
		// 인덱스(첨자) 연산을 사용
		// 배열의 인덱스(첨자) : 시작은 0, 종료는 (배열의 크기 - 1)
		// 배열변수명[인덱스(첨자)] = 값;
		a[0] = 100; // 배열의 1번째 요소에 값을 대입
		a[1] = 200; // 배열의 2번째 요소에 값을 대입
		a[2] = 300; // 배열의 3번째 요소에 값을 대입
		
		int i = 0;
		b[i] = 400;
		
		// int kor1, kor2, kor3;
		// kori = 98; // 에러
		
		i = 1;
		b[i] = 500;
		b[i + 1] = 600;
		
		for(i = 0; i < 3; i++)
			System.out.printf("a[%d] = %d\n", i, a[i]);
		for(i = 0; i < 3; i++)
			System.out.printf("b[%d] = %d\n", i, b[i]);
			
		
		sc.close();
		
	}

}
