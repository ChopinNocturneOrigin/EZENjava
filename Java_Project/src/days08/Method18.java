package days08;

import java.util.Scanner;

public class Method18 {

	public static void main(String[] args) {
		
		int[][] scores;
		double[] avg;
		String[] grade;
		Scanner sc = new Scanner(System.in);
		
		int s = getStudentNumber(sc); // 학생수를 입력 받아서 리턴하는 method
		int k = getSubjectNumber(sc); // 과목수를 입력 받아서 리턴하는 method
		
		scores = new int[s][k + 1]; // k는 과목수이며 총점 열을 위해 k + 1 만큼 지정
		
		avg = new double[s];
		grade = new String[s];
		
		input(scores, sc); // s명의 학생의 k개 과목 점수 입력 (과목 점수 입력 받을때, 과목명은 '1과목', '2과목' 으로)
		cals(scores, avg, grade); // 총점, 평균, 학점 계산
		output(scores, avg, grade); // 양식에 맞게 성적표 출력
		
		sc.close();
	}
	
	public static int getStudentNumber(Scanner sc) {
		int tempInputInt = 0;
		boolean loopFlag;
		do {
			loopFlag = false;
			try {
				System.out.print("학생수를 입력하세요 : ");
				tempInputInt = sc.nextInt();
				if (tempInputInt < 1) loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			} 
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);

		return tempInputInt;
	}

	public static int getSubjectNumber(Scanner sc) {
		int tempInputInt = 0;
		boolean loopFlag;
		do {
			loopFlag = false;
			try {
				System.out.print("과목수를 입력하세요 : ");
				tempInputInt = sc.nextInt();
				if (tempInputInt < 1) loopFlag = true;
			} catch (Exception e) {
				loopFlag = true;
				sc.nextLine();
			} 
			if (loopFlag) System.err.println("입력 오류!");
		} while (loopFlag);

		return tempInputInt;
		
	}
	
	public static void input(int[][] s, Scanner sc) {
		// s 참조변수는 main의 scores 변수 값을 받는 매개변수이므로
		// s 이름으로 배열에 값을 넣으면 main의 scores 배열에 값을 넣는 것과 같습니다.
		int tempInputInt = 0;
		boolean loopFlag;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length - 1; j++) {
				do {
					loopFlag = false;
					try {
						System.out.printf("%d번 학생의 %d과목 점수 : ", i + 1, j + 1);
						tempInputInt = sc.nextInt();
						if (tempInputInt < 1) loopFlag = true;
					} catch (Exception e) {
						loopFlag = true;
						sc.nextLine();
					} 
					if (loopFlag) System.err.println("입력 오류!");
				} while (loopFlag);
				s[i][j] = tempInputInt;
			}
		}
	}
	public static void cals(int[][] s, double[] avg, String[] grade) {
		String[] gd = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A", "A"};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length - 1; j++) 
				s[i][s[i].length - 1] += s[i][j];
			avg[i] = s[i][s[i].length - 1] / (double)(s[i].length - 1);
			grade[i] = gd[(int)(avg[i] / 10)];
		}
	}
	
	public static void output(int[][] s, double[] avg, String[] grade) {
		for (int i = 0; i < s[0].length - 1; i++)
			System.out.print("    ");
		System.out.println("     --= 성  적  표 =--");
		for (int i = 0; i < s[0].length - 1; i++)
			System.out.print("---------"); // 9 -> 4.5
		System.out.println("---------------------------"); // 22 -> 11
		System.out.print(" 번호");
		for (int i = 0; i < s[0].length - 1; i++)
			System.out.printf("%2d번과목 ", i + 1);
		System.out.println("   총점   평균   등급");
		for (int i = 0; i < s[0].length - 1; i++)
			System.out.print("---------");
		System.out.println("---------------------------");
		for (int i = 0; i < s.length; i++) {
			System.out.printf(" %2d  ", i + 1);
			for (int j = 0; j < s[i].length - 1; j++)
				System.out.printf("%6d   ", s[i][j]);
			System.out.printf("%6d%8.1f%6s\n",
					s[i][s[i].length - 1],
					avg[i],
					grade[i]
					);
		}
		for (int i = 0; i < s[0].length - 1; i++)
			System.out.print("---------");
		System.out.println("--------------------------");
	}

}
