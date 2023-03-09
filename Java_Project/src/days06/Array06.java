package days06;

public class Array06 {

	public static void main(String[] args) {
		
		// 배열에 있는 값들 중 최대값과 최소값을 찾아서 출력하세요.
		int[] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98, 100, 12};
		int min, max;
		
		min = max = a[0];
		for(int i : a) {
			min = (i < min) ? i : min;
			max = (i > max) ? i : max;
		}
		System.out.printf("최대값 : %d, 최소값 : %d\n", max, min);

	}

}
