package days06;

public class Array04 {

	public static void main(String[] args) {
		
		// 배열 a, b, c 생성 (각 갯수 10개)
		// a 배열에는 3의 배수들 10개 저장 - 반복 실행문 이용
		// b 배열에는 5의 배수들 10개 저장 - 반복 실행문 이용
		// c 배열에는 a배열과 b배열의 각 같은 인덱스 값들의 합을 저장
		// 반복실행문 이용
		// e.g.> c[3] = a[3] + b[3];
		// 출력
		// a배열 -> 3, 6, 9,12,15 ...
		// b배열 -> 5,10,15,20,25 ...
		// c배열 -> 8,16,24,32,40 ...
		
		int i;
		int[] a, b, c;
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		for(i = 0; i < 10; i++) {
			a[i] = (i + 1) * 3;
			b[i] = (i + 1) * 5;
			c[i] = a[i] + b[i];
		}
		
		// 출력
		System.out.print("a배열 ->");
		for(i = 0; i < (a.length - 1); i++)
			System.out.printf("%2d,",a[i]);
		System.out.printf("%2d\n",a[i]);
		
		System.out.print("b배열 ->");
		for(i = 0; i < (b.length - 1); i++)
			System.out.printf("%2d,",b[i]);
		System.out.printf("%2d\n",b[i]);
		
		System.out.print("c배열 ->");
		for(i = 0; i < (c.length - 1); i++)
			System.out.printf("%2d,",c[i]);
		System.out.printf("%2d\n",c[i]);
		// 배열이름.length : 배열에 할당되어 있는 공간의 갯수

		
	}

}
