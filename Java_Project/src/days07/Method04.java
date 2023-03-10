package days07;

public class Method04 {

	public static void main(String[] args) {
		
		// printTitle() : 성적표 제목, 번호 이름 국어 영어 등과 같은 열 제목을 출력하는 method
		// printScore() : 이름, 국어, 영어 수학 점수를 전달 받아서 총점 평균을 계산하고 성적 점수들을 출력하는 method
		printTitle(true);
		printScore(1, "홍길동", 87, 89, 97);
		printScore(2, "홍길서", 45, 98, 78);
		printScore(3, "홍길남", 77, 88, 99);
		printTitle(false);

	}
	
	public static void printTitle(boolean checkValue) {
		if (checkValue) {
			System.out.println("\t     --= 성  적  표 =--");
			System.out.println("-----------------------------------------------");
			System.out.println(" 번호  성  명   국어  영어  수학   총점   평균");
		}
		System.out.println("-----------------------------------------------");
	}

	public static void printScore(int number, String name, int scoreKor, int scoreEng, int scoreMat) {
		int scoreTotal = scoreKor + scoreEng + scoreMat;
		double scoreAverage = scoreTotal / 3.0;
		System.out.printf("%4d%6s%6d%6d%6d%7d%8.1f\n",
				number,
				name,
				scoreKor,
				scoreEng,
				scoreMat,
				scoreTotal,
				scoreAverage);
	}

}
