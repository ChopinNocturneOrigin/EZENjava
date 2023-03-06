package days02;

public class Println02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println()으로 출력되는 실수는 소수점 조절이 되지 않습니다.
		// System.out.println()으로 출력되는 수치 데이터는 소수점 정렬도 하기가 어렵습니다.
		// 단순출력은 print()로도 가능합니다.

		String[] StudentName = {"홍길동", "홍길서", "홍길남"};				// 학생 이름
		int[][] StudentScore = {{89, 87, 89}, {87, 55, 87}, {100, 100, 100}};	// 학생 성적 국 영 수 순서
		
		System.out.println("\t\t     ### 성적표 ###");
		System.out.println("--------------------------------------------------------");
		System.out.println(" 번호      성  명    국어   영어   수학    총점    평균");
		System.out.println("--------------------------------------------------------");

		for(int i=0;i<3;i++) {
			long SumScore = 0;
			double AvgScore = 0;
			
			// 총점 및 평균 계산
			for(int j=0;j<3;j++) SumScore += StudentScore[i][j];
			AvgScore = (double)SumScore / 3.0;
			
			// 연번과 성명 출력
			System.out.println(
					String.format("%4d%10s%7d%7d%7d%8d%9.1f",
						i+1,
						StudentName[i],
						StudentScore[i][0],
						StudentScore[i][1],
						StudentScore[i][2],
						SumScore,
						AvgScore
						)
					);
		
		}

		System.out.print("--------------------------------------------------------\n");

	}

}
