package days02;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		// (입력)
		// 가지고 있는 사과의 개수 입력 : xx
		// 상자 하나에 담길 사과의 개수 입력 : xx
		
		// (출력)
		// 입력조건으로 포장 했을때, 포장된 박스개수, 남은 사과 개수 출력
		// 사과박스 수 : xx
		// 남은 사과 수 : xx
		
		int countApple, oneBoxQuantity, boxQuantity, remainApple;
		Scanner scannerInput = new Scanner(System.in);
		
		System.out.print("가지고 있는 사과의 개수 입력      : ");
		countApple = scannerInput.nextInt();
		System.out.print("상자 하나에 담길 사과의 개수 입력 : ");
		oneBoxQuantity = scannerInput.nextInt();
		
		boxQuantity = countApple / oneBoxQuantity;
		remainApple = countApple % oneBoxQuantity;
		System.out.println("사과박스 수\t: " + boxQuantity);
		System.out.println("남은 사과 수\t: " + remainApple);
		
		scannerInput.close();
	}

}
