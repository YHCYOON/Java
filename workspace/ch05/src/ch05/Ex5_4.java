package ch05;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int tmp = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < num.length; i++) {
			int n = (int) (Math.random() * 10);
			tmp = num[0];
			num[0] = num[n];
			num[n] = tmp;
		}
		
		System.out.println(Arrays.toString(num));
	}

}
