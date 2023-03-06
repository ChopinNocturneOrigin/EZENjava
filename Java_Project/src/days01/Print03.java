package days01;

public class Print03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                   ### 성적표 ###
		//------------------------------------------------------
		// 번호    성명    국어    영어    수학    총점    평균
		//------------------------------------------------------
		//   1	  홍길동    89      87      89      254    85.2
		//   2	  홍길서    87      55      87      243    80.3
		//   3	  홍길남    59      88      66      254    82.4
		//------------------------------------------------------
		
		// 위 성적표의 내용 중 1번, 2번, 3번 학생의 데이터들을 %d, %f, %s를 이용하여 출력하고,
		// 총점 평균도 계산된 결과가 나오도록 구성하세요.
		
		String[] StudentName = {"홍길동", "홍길서", "홍길남"};				// 학생 이름
		int[][] StudentScore = {{89, 87, 89}, {87, 55, 87}, {100, 100, 100}};	// 학생 성적 국 영 수 순서

		System.out.printf("\t\t   ### 성적표 ###\n");
		System.out.println("-------------------------------------------------------");
		System.out.println(" 번호\t성  명\t국어\t영어\t수학\t총점\t  평균");
		System.out.println("-------------------------------------------------------");
		
		for(int i=0;i<3;i++) {
			long SumScore = 0;
			double AvgScore = 0;
			
			// 총점 및 평균 계산
			for(int j=0;j<3;j++) SumScore += StudentScore[i][j];
			AvgScore = (double)SumScore / 3.0;
			
			// 연번과 성명 출력
			System.out.printf("%4d\t%s",
					i+1,
					StudentName[i]
					);
			
			// 국 영 수 성적 출력
			for(int j=0;j<3;j++) System.out.printf("\t%3d",StudentScore[i][j]);
			
			// 총점 및 평균 출력
			System.out.printf("\t%4d\t%6.1f\n",
					SumScore,
					AvgScore
					);
		}

		System.out.println("-------------------------------------------------------");

	}

}
