package days06;

import java.util.Arrays;

public class Array08 {

	public static void main(String[] args) {
		
		// Lotto 번호 생성기
		
		int[] a = new int[6];
		int tempNumber = 0, swapTemp;
		boolean chkEqualNumber;
		
		// 1 ~ 45 사이의 임의의 난수를 a 배열에 여섯개 저장한 후,
		// 오름차 순으로 정렬해서 출력하세요.
		// 다섯 세트가 출력
		for (int k = 0; k < 5; k++) {
			for (int i = 0; i < 6; i++) {
				do {
					tempNumber = (int)(Math.random() * 45) + 1;
					// 중복처리
					chkEqualNumber = false;
					for (int j : a)
						if (tempNumber == j) chkEqualNumber = true;
				} while (chkEqualNumber);
				a[i] = tempNumber;
			}
			for (int i = 0; i < (a.length - 1); i++) 
				for (int j = i + 1; j < a.length; j++)
					if (a[i] > a[j]) {
						swapTemp = a[j];
						a[j] = a[i];
						a[i] = swapTemp;
					}
			System.out.println(Arrays.toString(a));
		}
		
	}

}
