package days07;

import java.util.Arrays;

public class Method07 {

	public static void main(String[] args) {

		int[] a = {50, 60, 80, 70, 20, 10, 60, 120, 64, 150};
		Integer[] b = {50, 60, 80, 70, 20, 10, 60, 120, 64, 150};
		// a배열을 오름차순 또는 내림차순으로 정령해서 출력하는 아래 method를 작성하세요.
		printSortAsc(a); // 오름차순 정렬 후 출력
		printSortDesc(a); // 내림차순 정렬 후 출력
		System.out.println();
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(b, (i1, i2) -> i2 - i1);
		System.out.println(Arrays.toString(b));
		
		
	}
	
	public static void printSortAsc(int[] a) {
		int swapTemp;
		for (int i = 0; i < a.length - 1 ; i++)
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a [j]) {
					swapTemp = a[j];
					a[j] = a[i];
					a[i] = swapTemp;
				}
			}
		System.out.println(Arrays.toString(a));
	}

	public static void printSortDesc(int[] a) {
		int swapTemp;
		for (int i = 0; i < a.length - 1 ; i++)
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a [j]) {
					swapTemp = a[j];
					a[j] = a[i];
					a[i] = swapTemp;
				}
			}
		System.out.println(Arrays.toString(a));
	}
	
}
