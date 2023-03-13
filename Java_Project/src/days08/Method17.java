package days08;

import java.util.Arrays;

public class Method17 {

	public static void main(String[] args) {
		
		sort("asc", 78, 25, 56, 32, 45, 78, 98); // 오름차순
		System.out.println();
		sort("desc", 97, 75, 23, 65, 45, 8, 56, 98, 78, 12); // 내림차순

	}
	// 같은 자료형의 갯수가 정해지지 않은 전달인자를 int ... a 와 같은 매개변수로 처리할때
	// 추가로 전달할 전달인자가 있다면, 반드시 int .. a 가 가장 마지막에 위치해야 합니다.
	// 그렇지 않으면 배열에 전달되는 값들이 몇개인지 구분이 되지 않아 에러가 발생합니다.
	// public static void sort(int ... a, String order) { } // 에러
	
	public static void sort(String order, int ... a) {
		boolean sortFlag = order.equals("asc");
		int swapTemp;
		for (int i = 0; i < a.length - 1 ; i++)
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] > a [j] && sortFlag) || (a[i] < a [j] && !sortFlag)) {
					swapTemp = a[j];
					a[j] = a[i];
					a[i] = swapTemp;
				}
			}
		System.out.println(Arrays.toString(a));
	}

}
