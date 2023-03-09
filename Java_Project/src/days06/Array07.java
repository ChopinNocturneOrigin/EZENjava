package days06;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {
		int[] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98, 100, 12};
		int swapTemp;
		// Sort
		// 배열의 값들을 오름차순 또는 내림차순으로 재배치(정렬)
		
		// 이중반복문을 사용합니다.
		// 첫번째 반복문의 제어변수 i
		// 두번째 반복문의 제어변수 j
		// i = 0 일때 j 는 1 ~ 9로 반복시켜서 a[i]와 a[j] 둘을 비교하고
		// a[j] 값이 더 작으면 a[i]와 a[j]의 값을 오름 차순에 맞게 서로 바꿉니다.
		
		// i = 1 일때 j 는 2 ~ 9로 반복시켜서 a[i]와 a[j] 둘을 비교
		// i = 2 일때 j 는 3 ~ 9로 반복시켜서 a[i]와 a[j] 둘을 비교
		// i = 3 일때 j 는 4 ~ 9로 반복시켜서 a[i]와 a[j] 둘을 비교
		// j 번째가 더 작은 값이면 i번째와 j번째를 서로 바꿉니다.
		
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
		
	}

}
