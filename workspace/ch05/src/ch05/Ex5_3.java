package ch05;

public class Ex5_3 {

	public static void main(String[] args) {
		int[] score = {42, 53, 82, 48, 97, 21};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최고점은 " + max);
		System.out.println("최저점은 " + min);
	}

}
