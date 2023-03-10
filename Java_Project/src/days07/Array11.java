package days07;

import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		
		// 반복실행문을 이용한 배열의 조회 및 출력

		int swapTemp;
		double swapTempDouble;
		String swapTempString;
		int[] a = {98, 78, 56, 45, 78};
		double[] b = {45.6, 23.4, 69.54, 56.3, 87.0};
		String[] c = {"Korea", "USA", "Japan", "China", "Canada"};
		
		// a : 사용될 배열의 이름
		// i : 배열이 각 요소들을 저장할 변수
		// a 배열의 각 값들을 0번부터 마지막까지 하나씩 꺼내서 i변수에 저장하고 반복실행
		
		for (int i : a)
			System.out.printf("%d ", i);
		System.out.println();
		for (double d : b)
			System.out.printf("%.1f ", d);
		System.out.println();
		for (String s : c)
			System.out.printf("%s ", s);
		System.out.println();

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

		System.out.println();
		
		for (int i = 0; i < (a.length - 1); i++) 
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					swapTemp = a[j];
					a[j] = a[i];
					a[i] = swapTemp; 
				}
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < (a.length - 1); i++) 
			for (int j = i + 1; j < a.length; j++)
				if (a[i] < a[j]) {
					swapTemp = a[j];
					a[j] = a[i];
					a[i] = swapTemp; 
				}
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < (b.length - 1); i++) 
			for (int j = i + 1; j < b.length; j++)
				if (b[i] > b[j]) {
					swapTempDouble = b[j];
					b[j] = b[i];
					b[i] = swapTempDouble; 
				}
		System.out.println(Arrays.toString(b));

		for (int i = 0; i < (b.length - 1); i++) 
			for (int j = i + 1; j < b.length; j++)
				if (b[i] < b[j]) {
					swapTempDouble = b[j];
					b[j] = b[i];
					b[i] = swapTempDouble; 
				}
		System.out.println(Arrays.toString(b));
		
		for (int i = 0; i < (c.length - 1); i++) 
			for (int j = i + 1; j < c.length; j++)
				if (c[i].compareTo(c[j]) > 0) {
					swapTempString = c[j];
					c[j] = c[i];
					c[i] = swapTempString; 
				}
		System.out.println(Arrays.toString(c));

		for (int i = 0; i < (c.length - 1); i++) 
			for (int j = i + 1; j < c.length; j++)
				if (c[i].compareTo(c[j]) < 0) {
					swapTempString = c[j];
					c[j] = c[i];
					c[i] = swapTempString; 
				}
		System.out.println(Arrays.toString(c));
		
	}

}
