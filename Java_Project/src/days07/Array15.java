package days07;

public class Array15 {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		for (int k : a)
			System.out.printf("%d ", k);
		System.out.println("\n");
		
		// 반복이 되는 동안 a배열 값이 k변수에 반복 1회당 하나씩 모두 대입이 될 예정이라
		// 결국 위의 명령은 배열 값을 차례로 출력하는 효과를 얻습니다.
		
		int[][] b = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		for (int[] k : b) {
			for (int l : k)
				System.out.printf("%2d ", l);
			System.out.println();
		}

		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++)
				System.out.printf("%2d ", b[i][j]);
			System.out.println();
		}
		// b.length : 행의 갯수, b[i].length : i행의 열의 갯수
		
	}

}
