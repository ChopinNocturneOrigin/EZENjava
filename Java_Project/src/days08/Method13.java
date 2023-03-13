package days08;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);
		
		kor = myInput(1, sc); // 점수 입력
		eng = myInput(2, sc);
		mat = myInput(3, sc);
		
		printTitle(true);
		printScore(kor, eng, mat);
		printTitle(false);
		
		sc.close();
		
	}
	
	public static int myInput(int i, Scanner sc) {
		int tempInputInt = 0;
		boolean loopFlag;

		do {
			loopFlag = false;
			try {
				switch (i) {
				case 1:
					System.out.print("국어 점수를 입력하세요 : ");
					break;
				case 2:
					System.out.print("영어 점수를 입력하세요 : ");
					break;
				case 3:
					System.out.print("수학 점수를 입력하세요 : ");
				}
				tempInputInt = sc.nextInt();
				if (tempInputInt < 0 || tempInputInt > 100) loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			}
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);

		//sc.close();
		return tempInputInt;
		
	}
	
	public static int sum(int k, int e, int m) {
		return k + e + m;
	}
	
	public static double avg(int t) {
		return t / 3.0;
	}
	
	public static String selectGrade(double a) {
		String[] grade = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A", "A"};
		return grade[(int)(a / 10)];
	}

	public static void printTitle(boolean checkValue) {
		if (checkValue) {
			System.out.println("\t     --= 성  적  표 =--");
			System.out.println("---------------------------------------");
			System.out.println(" 국어  영어  수학   총점   평균   등급");
		}
		System.out.println("---------------------------------------");
	}

	public static void printScore(int scoreKor, int scoreEng, int scoreMat) {
		int scoreTotal = sum(scoreKor, scoreEng, scoreMat);
		double scoreAverage = avg(scoreTotal);
		String grade = selectGrade(scoreAverage);
		System.out.printf("%4d%6d%6d%7d%8.1f%6s\n",
				scoreKor,
				scoreEng,
				scoreMat,
				scoreTotal,
				scoreAverage,
				grade
				);
	}
	
}
