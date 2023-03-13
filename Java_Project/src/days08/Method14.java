package days08;

import java.util.Arrays;

public class Method14 {

	public static void main(String[] args) {
		int[] a = {65, 97, 89, 12, 45, 36, 57, 45};
		int tot = sum(a);
		double avg = average(a);
		printOut(a, tot, avg); // 배열안의 숫자들 출력 후 합계 평균 출력

	}
	
	public static int sum(int[] a) {
		int tot = 0;
		for (int i : a) tot += i;
		return tot;
	}
	
	public static double average(int[] a) {
		return sum(a)/(double)(a.length);
	}

	public static void printOut(int[] a, int tot, double avg) {
		System.out.println(Arrays.toString(a));
		System.out.printf("합계 : %d, 평균 : %.1f\n", tot, avg);
	}
}
