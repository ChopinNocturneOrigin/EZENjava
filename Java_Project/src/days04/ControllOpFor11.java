package days04;

public class ControllOpFor11 {

	public static void main(String[] args) {
		// 1 ~ 20 : 이전 숫자와 다음 숫자가 세트를 이루는 수열을 출력 하세요.
		// (0, 1, 2) (1, 2, 3) ... (19, 20, 21)
		
		for (int i = 1; i <= 20; i++) System.out.printf("(%d, %d, %d) ", i-1, i, i+1);

	}

}
