package days06;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		
		
		// 세명의 학생의 세과목 점수를 입력 받고 총점 평균을 계산해서 성적표를 출력하세요.
		Scanner scannerInput = new Scanner(System.in);
		
		System.out.print("성적표에 출력될 학생이 몇명인가요? : ");
		int stdNumber = scannerInput.nextInt();

		int[] kor = new int[stdNumber]; // 국어점수 저장용 배열
		int[] eng = new int[stdNumber]; // 영어점수 저장용 배열
		int[] mat = new int[stdNumber]; // 수학점수 저장용 배열
		int[] tot = new int[stdNumber]; // 총점 저장용 배열
		double[] avg = new double[stdNumber]; // 평균 저장용 배열
		String[] name = new String[stdNumber]; // 이름 저장용 배열
		double avgSum = 0.0;
		
		for(int i = 0; i < stdNumber; i++) {
			System.out.printf("%d번 학생\n", (i + 1));
			System.out.print("이름을 입력하세요. : ");
			name[i] = scannerInput.next();
			System.out.print("국어 성적을 입력하세요. : ");
			kor[i] = scannerInput.nextInt();
			System.out.print("영어 성적을 입력하세요. : ");
			eng[i] = scannerInput.nextInt();
			System.out.print("수학 성적을 입력하세요. : ");
			mat[i] = scannerInput.nextInt();
			
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;
			avgSum += avg[i];
		}
		
		System.out.println("\n\t\t     ### 성적표 ###");
		System.out.println("--------------------------------------------------------");
		System.out.println(" 번호      성  명    국어   영어   수학    총점    평균");
		System.out.println("--------------------------------------------------------");
		for(int i = 0; i < stdNumber; i++)
			System.out.printf("%4d%10s%7d%7d%7d%8d%9.1f\n",
						i + 1,
						name[i],
						kor[i],
						eng[i],
						mat[i],
						tot[i],
						avg[i]
					);
		System.out.println("--------------------------------------------------------");
		System.out.printf("                                       전체평균 : %5.1f\n", avgSum / stdNumber);
		System.out.println("--------------------------------------------------------");
		
		scannerInput.close();
		

	}

}
