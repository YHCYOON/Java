package ch05;

public class Ex5_2 {

	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		
		int[] score = {100, 84, 88, 74, 98};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (double)score.length;
		
		System.out.println("ÃÑ ÇÕÀº " + sum);
		System.out.println("Æò±ÕÀº " + average);
	}

}
