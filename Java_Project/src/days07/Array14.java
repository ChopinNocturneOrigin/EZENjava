package days07;

import java.util.Scanner;

public class Array14 {

	public static void main(String[] args) {
		
		// 3명의 학생의 3과목 점수 저장 배열. 마지막 열은 총점
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		String[] name = new String[3];
		String[] className = {"국어", "영어", "수학"};
		char[] grade = new char[3];
		char[] grades = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
		String tempName = null;
		int tempScore = 0;
		boolean loopFlag;
		
		Scanner sc = new Scanner(System.in);
		
		// 각 학생의 이름과 세 과목의 점수를 입력
		for (int i = 0; i < avg.length; i++) {
			System.out.println((i + 1) + "번 학생" );
			System.out.print("이름 : ");
			do {
				loopFlag = false;
				try {
					tempName = sc.next();
				} catch (Exception e) {
					loopFlag = true;
					sc.nextLine();
				}
				if (loopFlag) System.err.println("입력 오류!");
			} while (loopFlag);
			name[i] = tempName;

			for (int j = 0; j < className.length; j++) {
				System.out.print(className[j] + "점수 : ");
				do {
					loopFlag = false;
					try {
						tempScore = sc.nextInt();
						if (tempScore < 0 || tempScore > 100) 
							loopFlag = true;
					} catch (Exception e) {
						loopFlag = true;
						sc.nextLine();
					}
					if (loopFlag) System.err.println("입력 오류!");
				} while (loopFlag);
				score[i][j] = tempScore;
				score[i][3] += tempScore;
			}
			avg[i] = (double)score[i][3] / className.length;
			grade[i] = grades[(int)avg[i] / 10]; 
		}

		// 출력
		System.out.println("\t\t\t\t  --= 성  적  표 =--");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("번호\t 성      명\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("--------------------------------------------------------------------");
		for(int i = 0; i < avg.length; i++) {
			System.out.printf(" %2d", i + 1);
			System.out.printf("%10s", name[i]);
			for(int j = 0; j < score[i].length; j++)
				System.out.printf("%8d", score[i][j]);
			System.out.printf("%8.1f", avg[i]);
			System.out.printf("%3c\n", grade[i]);
		}
		System.out.println("--------------------------------------------------------------------");
		
		sc.close();

	}

}
