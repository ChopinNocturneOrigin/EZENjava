package days03;

import java.util.Scanner;

public class ControllOpIF08 {

	public static void main(String[] args) {
		
		Scanner scannerInput = new Scanner(System.in);
		int kor, eng, mat, total;
		double avg;
		System.out.print("국어 점수 : ");
		kor = scannerInput.nextInt();
		System.out.print("영어 점수 : ");
		eng = scannerInput.nextInt();
		System.out.print("수학 점수 : ");
		mat = scannerInput.nextInt();
		total = kor + eng + mat;
		avg = total / 3.0;
		
		// 평균 60점 이상이면서 모든 과목 40이상이면 합격
		// 그렇지 않다면 불합격을 출력하되
		// 해당되는 불합격사유 (평균 미달, 국어 과락, 영어 과락, 수학 과락)을 모두 함께 출력하세요.
		
		if ((avg < 60.0) || (kor < 40) || (eng < 40) || (mat < 40)) {
			System.out.println("\n불합격 입니다.\n\n     -= 불합격 사유 =-");
			if (avg < 60.0) System.out.printf("평균 점수:%.0f, 평균이 미달 입니다.\n", avg);
			if (kor < 40) System.out.printf("국어 점수:%d, 국어 과락 입니다.\n", kor);
			if (eng < 40) System.out.printf("영어 점수:%d, 영어 과락 입니다.\n", eng);
			if (mat < 40) System.out.printf("수학 점수:%d, 수학 과락 입니다.\n", mat);
		} else System.out.println("합격 입니다.");
		
		
		scannerInput.close();

	}

}
