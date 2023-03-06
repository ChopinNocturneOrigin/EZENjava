package days01;

public class JavaThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.printf()를 이용해서 다음과 같이 출력하세요.
		
		//                   ### 성적표 ###
		//------------------------------------------------------
		// 번호    성명    국어    영어    수학    총점    평균
		//------------------------------------------------------
		//   1	  홍길동    89      87      89      254    85.2
		//   2	  홍길서    87      55      87      243    80.3
		//   3	  홍길남    59      88      66      254    82.4
		//------------------------------------------------------

		System.out.printf("\t\t   ### 성적표 ###\n");
		System.out.println("------------------------------------------------------");
		System.out.println(" 번호\t성  명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------");
		System.out.println("   1\t홍길동\t 89\t 87\t 89\t 254\t85.2");
		System.out.println("   2\t홍길서\t 87\t 55\t 87\t 243\t80.3");
		System.out.println("   3\t홍길남\t 59\t 88\t 66\t 254\t82.4");
		System.out.println("------------------------------------------------------");
		
		//
		String[] StudentName = {"홍길동", "홍길서", "홍길남"};
		int[][] StudentScore = {{89, 87, 89}, {87, 55, 87}, {59, 88, 66}};
		
		for(int i=0;i<3;i++) {
			long SumScore = 0;
			double AvgScore = 0;
			
			for(int j=0;j<3;j++) SumScore += StudentScore[i][j];
			AvgScore = (double)SumScore / 3.0;
			
			System.out.printf("%4d\t%s\t%3d\t%3d\t%3d\t%4d\t%.1f\n",
					i+1,
					StudentName[i],
					StudentScore[i][0],
					StudentScore[i][1],
					StudentScore[i][2],
					SumScore,
					AvgScore
					);
		}
	}

}
