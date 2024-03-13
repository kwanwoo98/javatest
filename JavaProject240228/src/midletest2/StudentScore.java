package midletest2;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = { { 80, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };

		System.out.println("학생번호 국어 영어 수학 총점 평균");
		System.out.println("=============================================");
		
		int sum = 0;
		float avg = 0;

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum = sum+scores[i][j];
			}
			avg = sum / scores[i].length;
			String avgS = String.format("%.1f", avg);
			System.out.println((i + 1) + "번 학생: " + (scores[i][0]) + " " + (scores[i][1]) + " " + (scores[i][2]) + " "
					+ sum + " " + avgS);
			sum = 0;
			avg = 0;
		}
	}
}
