package ch05;

public class Ex5_8 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 40, 50},
				{10, 30, 40},
				{20, 20, 20},
				{45, 25, 80}
		};
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		System.out.println("모든 항의 합 = " + sum);
	}

}
