package days02;

import java.util.Scanner;

public class Variable03 {
	
	public static void main(String[] args) {
		// 삼각형의 밑변와 높이를 입력 받아서 면적을 출력
		// 삼각형의 면적 : 밑변 x 높이 x 0.5
		
		// 입력
		// 삼각형의 밑변 입력 : xx
		// 삼각형의 높이 입력 : xx
		
		// 출력
		// 입력하신 삼각형의 면적은 xx.x 입니다.
		
		int triangleWidth, triangleHeight; // 삼각형이 높이, 밑변을 저장할 변수
		double triangleArea; // 삼각형의 면적을 계산해서 저장할 변수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-= 삼각형의 면적 계산 =-");
		System.out.print("삼각형의 밑변 입력 : ");
		triangleWidth = sc.nextInt();
		System.out.print("삼각형의 높이 입력 : ");
		triangleHeight = sc.nextInt();
		
		triangleArea = triangleWidth * triangleHeight * 0.5;
		
		System.out.printf("삼각형의 면적은 %.1f 입니다.\n", triangleArea);
		
		sc.close();
	}

}
