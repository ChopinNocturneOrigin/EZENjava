package days02;

public class Print05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] StudentName = {"홍길동", "홍길서", "홍길남"};				// 학생 이름
		int[][] StudentScore = {{89, 87, 89}, {87, 55, 87}, {100, 100, 100}};	// 학생 성적 국 영 수 순서
		
		System.out.printf("                    ### 성적표 ###\n");
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
			System.out.printf("%4d%10s",
					i+1,
					StudentName[i]
					);
			
			// 국 영 수 성적 출력
			for(int j=0;j<3;j++) System.out.printf("%7d",StudentScore[i][j]);
			
			// 총점 및 평균 출력
			System.out.printf("%8d%9.1f\n",
					SumScore,
					AvgScore
					);
		}

		System.out.println("--------------------------------------------------------");

	}

}
