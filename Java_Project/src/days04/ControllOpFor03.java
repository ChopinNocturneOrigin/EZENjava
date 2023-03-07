package days04;

public class ControllOpFor03 {

	public static void main(String[] args) {
		
		// 1부터 10까지의 합
		int sum = 0;
		
		for (int i=1; i < 10001; i++) { 
			sum += i;
			System.out.printf("1 ~ %5d의 합 -> %8d\n", i, sum);
		}

	}

}
